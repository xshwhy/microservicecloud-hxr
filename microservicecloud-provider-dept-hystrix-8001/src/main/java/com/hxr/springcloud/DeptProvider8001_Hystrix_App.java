package com.hxr.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptProvider8001_App
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 17:39
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan(value = "com.hxr.springcloud.dao")
@EnableEurekaClient // 本服务启动后会自动注册到eureka中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker // 熔断器机制支持
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}
