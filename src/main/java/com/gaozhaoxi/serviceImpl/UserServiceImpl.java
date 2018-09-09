package com.gaozhaoxi.serviceImpl;

import com.gaozhaoxi.entity.User;
import com.gaozhaoxi.mapper.UserMapper;
import com.gaozhaoxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leon
 */

//User 服务层接口实现类
@Service("userService")  //用于将当前类注释为一个Spring的bean，名为userService
public class UserServiceImpl implements UserService{
    @Autowired //必须要mapper文件和applicationContext.xml中配置mybatis scan才能使得不
    private UserMapper userMapper;

    @Override
    public User login(String loginname, String loginpassword) {
        return userMapper.findUserWithLoginnameAndLoginpassword(loginname,loginpassword);
    }
}
