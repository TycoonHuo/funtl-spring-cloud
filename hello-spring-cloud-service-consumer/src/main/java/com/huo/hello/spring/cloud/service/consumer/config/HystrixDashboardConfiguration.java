package com.huo.hello.spring.cloud.service.consumer.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixDashboardConfiguration {
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HystrixMetricsStreamServlet> streamServletServletRegistrationBean = new ServletRegistrationBean<>(hystrixMetricsStreamServlet);
        streamServletServletRegistrationBean.setLoadOnStartup(1);
        streamServletServletRegistrationBean.addUrlMappings("/hystrix.stream");
        return streamServletServletRegistrationBean;
    }
}
