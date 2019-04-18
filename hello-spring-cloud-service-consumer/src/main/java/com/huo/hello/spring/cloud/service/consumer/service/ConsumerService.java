package com.huo.hello.spring.cloud.service.consumer.service;

import com.huo.hello.spring.cloud.service.consumer.service.hystrix.ConsumerServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = ConsumerServiceHystrix.class)
public interface ConsumerService {

    @GetMapping("/hi")
    String echo(@RequestParam("message") String message);
}
