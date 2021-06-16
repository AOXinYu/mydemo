package com.example.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldContoller {
    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "hello 测试再次提交!";
    }

}
