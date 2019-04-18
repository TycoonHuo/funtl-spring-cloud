package com.huo.hello.spring.cloud.service.consumer.controller;

import com.huo.hello.spring.cloud.service.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/hi")
    public String echo(@RequestParam("message") String message) {
        return consumerService.echo(message);
    }
}
