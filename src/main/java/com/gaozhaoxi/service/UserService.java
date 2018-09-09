package com.gaozhaoxi.service;

import com.gaozhaoxi.entity.User;

/**
 * @author Leon
 */
public interface UserService {
    /*判断用户是否登录
    *
    * return 找到返回User对象，没有找到返回null
    * */
    User login(String loginname,String loginpassword);
}
