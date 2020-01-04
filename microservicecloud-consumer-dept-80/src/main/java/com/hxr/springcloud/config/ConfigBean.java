package com.hxr.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-30 19:43
 * @Version: 1.0
 **/

// 定义配置类
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端  负载均衡的工具
   public RestTemplate restTemplate() {

        return new RestTemplate();
   }

   @Bean
   public IRule myRule() {
        // 达到目的，用我们重新选择的随机算法替代默认的轮播
//        return new RandomRule();
       return new RetryRule();
   }

}
