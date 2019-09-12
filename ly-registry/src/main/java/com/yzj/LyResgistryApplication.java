package com.yzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 作者: yzj
 * 日期: 2019/8/26
 */
@SpringBootApplication
@EnableEurekaServer
public class LyResgistryApplication {
    public static void main(String[] args ){
        SpringApplication.run(LyResgistryApplication.class,args);
    }
}
