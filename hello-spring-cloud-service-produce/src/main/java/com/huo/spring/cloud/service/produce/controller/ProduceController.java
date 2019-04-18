package com.huo.spring.cloud.service.produce.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String echo(@RequestParam("message") String message){
        return String.format("echo:%s,你访问的端口是%s",message,port);
    }
}
