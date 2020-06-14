package com.hzc.api.controller;

import com.hzc.api.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/root/xx")
public class TestController {
    @Autowired
    private TestFeign feign;

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(){
        System.out.println(port);
       return feign.getId();
    }

    @RequestMapping("/test2")
    public String test2(){
        return feign.getPwd();
    }

}
