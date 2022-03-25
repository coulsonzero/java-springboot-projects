package com.shville.controller;


import com.shville.listener.TestEvent;
import com.shville.service.TestAsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Slf4j
@Controller
public class MainController {
    @Resource
    TestAsyncService asyncService;
    @Resource
    ApplicationContext context;

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
