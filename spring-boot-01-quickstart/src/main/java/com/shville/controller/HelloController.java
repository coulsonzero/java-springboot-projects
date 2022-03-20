package com.shville.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 控制反转
@RestController
// 配置路由router("http://localhost/hello")
@RequestMapping("/hello")
public class HelloController {

    // http请求 方式: get
    @GetMapping
    public String hello() {
        return "Hello, SpringBoot !";
    }
}

