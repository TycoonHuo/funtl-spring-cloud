package com.huo.hello.spring.cloud.service.consumer.service.hystrix;

import com.huo.hello.spring.cloud.service.consumer.service.ConsumerService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceHystrix implements ConsumerService {
    @Override
    public String echo(String message) {
        return String.format("你的参数是:%s,请刷新试试呢",message);
    }
}
