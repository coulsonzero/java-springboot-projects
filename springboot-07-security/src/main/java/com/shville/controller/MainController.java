package com.shville.controller;

import com.shville.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

    @Value ("${userName}")
    private String userName;

    @Autowired
    private Environment env;

    @RequestMapping("/index")
    @GetMapping
    public String index() {
        return "Springboot is running!";
    }

    @RequestMapping("/student")
    public Student student() {
        Student s = new Student();
        s.setId(Integer.parseInt(env.getProperty("userId")));
        s.setName(userName);
        s.setSex(1);
        return s;     // {"id":1001, "name":"CoulsonZero", "sex":1}
    }
}
