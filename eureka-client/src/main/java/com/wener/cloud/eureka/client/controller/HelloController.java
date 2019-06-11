package com.wener.cloud.eureka.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HelloController {
    @Value("${server.port}")
    private String port;
    
    @RequestMapping("/")
    public String index() {
        return port;
    }
}