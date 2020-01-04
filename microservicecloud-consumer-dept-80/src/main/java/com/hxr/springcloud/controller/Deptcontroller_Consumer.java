package com.hxr.springcloud.controller;

import com.hxr.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @ClassName: Deptcontroller_Consumer
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-30 19:53
 * @Version: 1.0
 **/
@RestController
public class Deptcontroller_Consumer {

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";

    /**
     *  使用restTemple访问restful接口简单粗暴
     *  (url，requestMap，ResponseBean.class)这三个参数分别代表
     *  REST请求地址、请求参数、HTTP响应转换被转换成的对象类型
     */

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/dept/add")
    public Boolean add (Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery () {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }




}
