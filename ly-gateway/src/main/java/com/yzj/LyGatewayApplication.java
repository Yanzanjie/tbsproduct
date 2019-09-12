package com.yzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 作者: yzj
 * 日期: 2019/8/26
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LyGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(LyGatewayApplication.class);
    }
}
