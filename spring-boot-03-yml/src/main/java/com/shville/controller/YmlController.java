package com.shville.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class YmlController {

    @Value("country")
    private String country;

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String hello() {
        System.out.println("SpringBoot is running!");
        System.out.println("country >> " + country);
        System.out.println("server.port >> " + port);
        return "Hello, SpringBoot !";
    }
}

