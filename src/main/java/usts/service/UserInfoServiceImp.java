package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.UserInfoMapper;
import usts.pojo.UserInfo;
import usts.pojo.UserInfoExample;

import javax.annotation.Resource;
import java.util.List;

@Service("userInfoService")
public class UserInfoServiceImp implements UserInfoService {
    @Resource
    UserInfoMapper userInfoMapper;

    //fuId是第三方的平台id
    @Override
    public UserInfo getByRelationId(String fuId) {

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andFuIdEqualTo(fuId);

        List<UserInfo> lst  = userInfoMapper.selectByExample(userInfoExample);
        UserInfo userInfo = new UserInfo();
        for (int i =0;i<lst.size();i++){
            userInfo= lst.get(0);
        }
        return userInfo;
    }

    @Override
    public UserInfo getByThirdId(String fuId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setFuId(fuId);
        userInfo.setStatus(1);

        userInfoMapper.insertSelective(userInfo);
        if(getByRelationId(fuId)!=null){
            userInfo= getByRelationId(fuId);
        }
        return userInfo;
    }

    @Override
    public int user_update(UserInfo user) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());

        int re =userInfoMapper.updateByExampleSelective(user,userInfoExample);
        return re;
    }

    @Override
    public UserInfo getUserInfo(Integer userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return userInfo;
    }

}
