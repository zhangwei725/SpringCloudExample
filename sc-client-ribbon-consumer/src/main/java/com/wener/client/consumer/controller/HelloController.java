package com.wener.client.consumer.controller;

import com.wener.client.consumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping("/")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
