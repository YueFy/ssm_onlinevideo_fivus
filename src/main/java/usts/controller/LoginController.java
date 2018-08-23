package usts.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import usts.pojo.*;
import usts.service.UserInfoService;
import usts.service.UserOauthService;
import usts.service.UserService;
import usts.utils.BaiduUtil;
import usts.utils.HttpGetUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("login")
public class LoginController {
    @Resource
    UserService userService;
    @Resource
    UserInfoService userInfoService;
    @Resource
    UserOauthService userOauthService;

    @ResponseBody
    @RequestMapping("/register")
    public UserInfo registerUser(String name, String email, String phone, String pwd){
        System.out.println(name);

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String time = dateString;

        int userId ;
        User userRegister = new User();
        UserInfo userInfoRegister = new UserInfo();
        UserOauth userOauthRegister = new UserOauth();

        userInfoRegister.setFuId("email_"+name);
        UserInfo userInfoSuccess = userInfoService.getByThirdId(userInfoRegister.getFuId());
        userInfoSuccess.setRegisterTime(time);
        userInfoSuccess.setAvatar("portrait/initImg.jpg");
        userInfoSuccess.setLoginTime(time);
        userInfoService.user_update(userInfoSuccess);

        userId = userInfoSuccess.getUserId();

        userRegister.setUserId(userId);
        userRegister.setFuEmail(email);
        userRegister.setFuId("email_"+name);
        userService.insertIntoU(userRegister);

        userOauthRegister.setUserId(userId);
        userOauthRegister.setFuId("email_"+name);
        userOauthRegister.setIdentityType("email");
        //下面两个是登陆的判断
        userOauthRegister.setIdentifier(email);
        userOauthRegister.setCredential(pwd);
        userOauthService.insertIntoUO(userOauthRegister);
        return userInfoSuccess;
    }

    @ResponseBody
    @RequestMapping("/fivuslogin")
    public UserInfo fivuslogin(String email, String pwd){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String time = dateString;

        int userId;
        UserInfo userInfoLogin = new UserInfo();
        UserOauth userOauthLogin = new UserOauth();

        userOauthLogin.setIdentifier(email);
        userOauthLogin.setCredential(pwd);

        UserOauth userOauthSuccess =  userOauthService.login(userOauthLogin);

        userId=userOauthSuccess.getUserId();

        userInfoLogin = userInfoService.getUserInfo(userId);
        userInfoService.user_update(userInfoLogin);
        userInfoLogin.setLoginTime(time);

        return userInfoLogin;
    }

    @ResponseBody
    @RequestMapping("/upimg")
    public void uploadFile(@RequestParam("img") MultipartFile multipartFile,@RequestParam("iduserId") String iduserId,HttpServletRequest request,HttpServletResponse response) throws IOException {
        int userId = Integer.parseInt(iduserId);
        if (!multipartFile.isEmpty()) {
            try {

                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("\\") + "portrait\\"
                        + multipartFile.getOriginalFilename();
                // 转存文件
                multipartFile.transferTo(new File(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            String avatar = "portrait/"+multipartFile.getOriginalFilename();
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(userId);
            userInfo.setAvatar(avatar);
            int upimg=userInfoService.user_update(userInfo);
            response.sendRedirect("../");
    }

    @ResponseBody
    @RequestMapping("/showUser")
    public UserInfo showUser(Integer userId){
            UserInfo userInfoShow=userInfoService.getUserInfo(userId);
            return  userInfoShow;
    }

    /**
     * 百度第三方登录
     */
    @ResponseBody
    @RequestMapping(value = "/baidulogin",produces = "text/html;charset=UTF-8")
    public void baidu_login(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String time = dateString;

        User us = new User();
        UserInfo result = new UserInfo();
        UserOauth uo = new UserOauth();
        String code = request.getParameter("code");//客户端传回来的授权码


        String redirect_uri = "http://localhost:8081/login/baidulogin";
        String client_secret = "GWdVCluzoBemVclDXYB35fs1DluzQaVK";
        String client_id = "QRNSQLU3qPwzW3VE6naC2zCui2TR2x9K";
        String atokenUrl = "https://openapi.baidu.com/oauth/2.0/token?grant_type=authorization_code&code=" + code + "&client_id=" + client_id + "&client_secret=" + client_secret + "&redirect_uri=" + redirect_uri;
        String ret = HttpGetUtil.httpGet(atokenUrl);//返回带token的json字符串
        //JSONObject obj = JSONObject.parseObject(ret);

        ObjectMapper mapper = new ObjectMapper();
        BdToken bdToken = mapper.readValue(ret, BdToken.class);

        //String access_token = (String) obj.get("access_token");//取出token
        String access_token = bdToken.getAccess_token();
        String apiUrl = "https://openapi.baidu.com/rest/2.0/passport/users/getInfo?access_token=" + access_token;
        String uinfoma = HttpGetUtil.httpGet(apiUrl);//返回的用户信息json字符串
        if (uinfoma != null) {//授权成功

            if (request.getSession().getAttribute("user") == null) {//说明是登录页面来的

                //JSONObject oobj = JSON.parseObject(uinfoma);
                ObjectMapper mapperr = new ObjectMapper();
                BdUserInfo bdUserInfo = mapperr.readValue(uinfoma, BdUserInfo.class);
                //String portrait = (String) oobj.get("portrait");

                String portrait = bdUserInfo.getPortrait();
                uo.setIdentityType("baidu");
                uo.setCredential(portrait);

                //String userid = (String) oobj.get("userid");
                String userid = bdUserInfo.getUserid();
                //String username = (String) oobj.get("username");
                String username = bdUserInfo.getUsername();//第三方平台昵称
                String thirdId = "baidu_" + username;//第三方平台的id
                UserInfo userbyRelationId = userInfoService.getByRelationId(thirdId.trim());//判断是账号是否关联过本地账号
                int userId = userbyRelationId.getUserId();
                //System.out.println(portrait+"\n"+userid+"\n"+username+"\n"+thirdId);
                if (userId == 0) {//没有关联则注册一个本地账号
                    UserInfo user = null;
                    user = userInfoService.getByThirdId(thirdId);//insert
                    String avatar = null;//照片名
                    userId = user.getUserId();
                    avatar = userId + ".jpg";

                    uo.setUserId(userId);
                    us.setUserId(userId);
                    us.setFuId("baidu_"+username);
                    uo.setFuId("baidu_"+username);

                    userOauthService.insertIntoUO(uo);
                    userService.insertIntoU(us);
                    StringBuffer sb = new StringBuffer();
                    sb.append(userId);
                    String entwoCodeFileName = sb.toString() + ".jpg";//二维码图片文件名
                    System.out.println(entwoCodeFileName + "\n");
                    String path = request.getContextPath();
                    System.out.println(path + "\n");
                    String realpath = request.getSession().getServletContext().getRealPath("/");
                    System.out.println(realpath + "\n");
                    String an = URLEncoder.encode("&");//&转码
                    StringBuffer rootUrl = request.getRequestURL();
                    String tempContextUrl = rootUrl.delete(rootUrl.length() - request.getRequestURI().length(), rootUrl.length()).toString();
                    System.out.println(tempContextUrl + "\n");

                    // 写头像文件
                    String portraitUrl = "http://tb.himg.baidu.com/sys/portrait/item/" + portrait;
                    byte[] portraitData = BaiduUtil.downloadPortrait(portraitUrl);
                    String basePath = request.getSession().getServletContext().getRealPath("/");
                    BaiduUtil.savePortrait(basePath + File.separator + "portrait" + File.separator + avatar, portraitData);//图片写入文件夹下，图片名与用户id对应

                    if (user.getFuId() != null) {

                        user.setRegisterTime(time);//创建日期
                        user.setFuId("baidu_" + username);
                        user.setAvatar("portrait/"+avatar);


                        if (userInfoService.user_update(user) == 1) {// 更新用户信息
                            user = userInfoService.getUserInfo(user.getUserId());
                            result = user;
                        }
                    }
                } else {//有关联就取出信息
                    result = userbyRelationId;
                    result.setLoginTime(time);
                    userInfoService.user_update(result);
                }
            }
        }
        //ObjectMapper mapp = new ObjectMapper();
        //String mapJakcson = new String(mapper.writeValueAsString(result).getBytes(),"UTF-8");

        //Cookie userId = new Cookie("userId",String.valueOf(result.getUserId()));
        //userId.setMaxAge(604800);
        //response.addCookie(userId);
        showUser(result.getUserId());
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Origin","http://localhost:8081");
        response.setHeader("Set-Cookie","token=cowshield");
        response.sendRedirect("../index.html?userid="+result.getUserId());
    }
}
