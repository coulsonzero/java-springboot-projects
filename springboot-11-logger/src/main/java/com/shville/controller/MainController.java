package com.shville.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j      // 1. 添加日志注解
@Controller
public class MainController {
    @RequestMapping("/login1")
    public String login(HttpServletRequest request) {
        log.info("有人访问了此页面...");    // 2.打印日志
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
