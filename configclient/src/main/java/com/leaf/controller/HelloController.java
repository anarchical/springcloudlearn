package com.leaf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${hello}")
    private String hello;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }
    @GetMapping("/hello")
    public String hello(){
        return this.hello;
    }
}
