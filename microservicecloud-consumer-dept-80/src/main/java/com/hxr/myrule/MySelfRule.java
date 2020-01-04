package com.hxr.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MySelfRule
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-03 10:39
 * @Version: 1.0
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule(); // Ribbon默认是轮播，我自定义为随机
//        return new RoundRobinRule(); // Ribbon默认是轮播，我自定义为随机
        return new MyRandomRule(); // Ribbon默认是轮播，我自定义为随机
    }
}
