package com.hxr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer7001_App
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-31 13:22
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer    // Eureka服务端启动类，接收其它微服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
