package com.hzc.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service",fallback = TestFeignRollback.class)
public interface TestFeign {
    @RequestMapping(value = "/user/getId", method = RequestMethod.GET)
    String getId();

    @RequestMapping(value = "/user/getPwd", method = RequestMethod.GET)
    String getPwd();
}
