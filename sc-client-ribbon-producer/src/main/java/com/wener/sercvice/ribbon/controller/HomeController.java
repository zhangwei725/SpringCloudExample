package com.wener.sercvice.ribbon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangwei
 */
@RestController
public class HomeController {
    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is first message";
    }
}
