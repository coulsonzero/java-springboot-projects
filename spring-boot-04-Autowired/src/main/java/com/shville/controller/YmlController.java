package com.shville.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class YmlController {

    /**
     * 读取yml配置文件中的单个数据信息
     */
    @Value("country")
    private String country;

    @Value("${server.port}")
    private String port;

    @Value("${users[0].name}")
    private String name;

    @Value("${tempDir}")
    private String dir;

    /**
     * 自动装配
     * 读取所有配置信息
     */
    @Autowired
    private Environment env;

    @GetMapping
    public String hello() {
        System.out.println("SpringBoot is running!");
        System.out.println("country >> " + country);
        System.out.println("server.port >> " + port);
        System.out.println("users[0].name >> " + name);
        System.out.println("tempDir >> " + dir);

        System.out.println("-----------------------");

        System.out.println(env.getProperty("server.port"));

        return "Hello, SpringBoot !";
    }
}

