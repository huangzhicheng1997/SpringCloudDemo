package com.hzc.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
public class TestFeignRollback implements TestFeign{

    public String getId() {
        return "error";
    }


    public String getPwd() {
        return "error";
    }
}
