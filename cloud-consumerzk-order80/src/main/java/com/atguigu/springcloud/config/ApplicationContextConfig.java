package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author LiuJing
 * @Date: 2020/10/16/ 0:06
 * @Description
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //开启Ribbon的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
