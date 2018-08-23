package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.UserMapper;
import usts.pojo.User;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public void insertIntoU(User user) {
        int resus = userMapper.insertSelective(user);
    }
}
