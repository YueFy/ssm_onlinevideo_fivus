package usts.service;

import org.springframework.stereotype.Service;
import usts.pojo.UserInfo;


@Service
public interface UserInfoService {
    //判断第三方账号id是否关联过本地账号id
    public UserInfo getByRelationId(String fuId);
    //用第三方平台账号自动注册本地账号
    public UserInfo getByThirdId(String fuId);
    //更新本地用户信息
    public int user_update(UserInfo user);
    //通过userId查询用户信息
    public UserInfo getUserInfo(Integer userId);

}
