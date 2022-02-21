package com.shville.controller;

import com.shville.entity.JdbcSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class YmlController {

    // 装配配置文件中的单个数据
    @Value("${users[0].name}")
    private String name;

    // 自动装配所有数据
    @Autowired
    private Environment env;

    /** 自动装配指定数据 */
    @Autowired
    private JdbcSource jdbcSource;

    @GetMapping
    public String hello() {
        System.out.println("SpringBoot is running!");
        System.out.println("users[0].name >> " + name);
        System.out.println(env.getProperty("server.port"));
        System.out.println("-----------------------");

        System.out.println(jdbcSource);

        return "Hello, SpringBoot !";
    }
}

