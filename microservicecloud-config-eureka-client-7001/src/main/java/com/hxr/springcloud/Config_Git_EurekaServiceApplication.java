package com.hxr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: Config_Git
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-04 14:45
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServiceApplication.class,args);
    }
}
