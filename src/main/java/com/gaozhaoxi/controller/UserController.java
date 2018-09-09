package com.gaozhaoxi.controller;

import com.gaozhaoxi.entity.User;
import com.gaozhaoxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;


/**
 * @author Leon
 */

@Controller
public class UserController {
    //自动注入UserService
    @Autowired
    @Qualifier("userService")  //指定注入的类型是service的实现类
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(String loginname, String loginpassword, ModelAndView mv, HttpSession httpSession){
        if(loginname==null || loginpassword==null){
            mv.setViewName("loginForm");
            return mv;
        }
        //根据登录名和密码查找用户，判断用户登录
        User user=userService.login(loginname,loginpassword);
        if(user!=null){
            //登录成功
            httpSession.setAttribute("user",user);
//            mv.setView(new RedirectView("main"));
            return new ModelAndView("main");
        }else {
            //登录失败
            mv.addObject("message","登录名或者密码错误！");
            mv.setViewName("loginForm");//跳转到登录页面
        }
        return mv;
    }
}
