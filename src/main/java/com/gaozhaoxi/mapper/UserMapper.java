package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Leon
 */
@Repository //启用此注解，使得applicationContext.xml中的mybatis扫描起效
public interface UserMapper {
    /*
    根据登录名和密码查询用户
     param String loginname
    param String password
    return 找到返回User 对象，没有找到返回null
    */
    @Select("select * from tb_user where loginname=#{loginname} and loginpassword=#{loginpassword}")
    User findUserWithLoginnameAndLoginpassword(@Param("loginname") String loginname,@Param("loginpassword") String loginpassword);
//    User findUserWithLoginnameAndLoginpassword(String loginname,@Param("loginpassword") String loginpassword);

}
