package com.wener.client.consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;
    public static final String REQUEST_URL = "http://CLIENT-PRODUCER/hello/";

    public String hello(String name) {
        String msg = restTemplate.getForObject(REQUEST_URL + "?name=" + name, String.class);
        return msg;
    }
}
