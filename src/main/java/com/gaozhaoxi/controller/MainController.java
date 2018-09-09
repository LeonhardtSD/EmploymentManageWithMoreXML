package com.gaozhaoxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
