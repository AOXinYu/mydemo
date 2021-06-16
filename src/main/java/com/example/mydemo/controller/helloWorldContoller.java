package com.example.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldContoller {
    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "测试，完成了GitHub设置并且配置好Jenkins ，第四次测试";
    }

}
