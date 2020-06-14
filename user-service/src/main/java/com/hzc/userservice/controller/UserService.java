package com.hzc.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService {
    @Value("${server.port}")
    String port;

    @RequestMapping("/getId")
    public String getId(){
        System.out.println(port);
        return "1";
    }

    @RequestMapping("/getPwd")
    public String getPwd() {
        return "1234";
    }
}
