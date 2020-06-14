package com.hzc.gateway.config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class RouterConfig {
 /*   @Bean
    public RouteLocator customRouter(RouteLocatorBuilder builder){
       return builder.routes().route("path1",
               predicateSpec -> predicateSpec.host("localhost:8082").uri("http://localhost:8083")
                       .filter(new HostNameFilter())).build();
    }*/

}
