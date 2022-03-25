package com.shville.controller;


import com.shville.service.TestAsyncService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MainController {
    @Resource
    TestAsyncService asyncService;

    @RequestMapping("/login1")
    public String login() {
        asyncService.testAsync();
        System.out.println("这是一个同步方法");
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
