package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.UserOauthMapper;
import usts.pojo.UserOauth;
import usts.pojo.UserOauthExample;

import javax.annotation.Resource;
import java.util.List;

@Service("userOauthService")
public class UserOauthServiceImp implements UserOauthService {

    @Resource
    UserOauthMapper userOauthMapper;

    @Override
    public void insertIntoUO(UserOauth uo) {
        int resuo = userOauthMapper.insertSelective(uo);
    }

    @Override
    public UserOauth login(UserOauth userOauthLogin) {
        UserOauth userLogin = null;

        UserOauthExample userOauthExample = new UserOauthExample();
        UserOauthExample.Criteria criteria = userOauthExample.createCriteria();
        criteria.andIdentifierEqualTo(userOauthLogin.getIdentifier());
        criteria.andCredentialEqualTo(userOauthLogin.getCredential());
        List<UserOauth> userOauthList=userOauthMapper.selectByExample(userOauthExample);
        if(userOauthList.size()!=0){
            userLogin = userOauthList.get(0);
        }
        return userLogin;
    }
}
