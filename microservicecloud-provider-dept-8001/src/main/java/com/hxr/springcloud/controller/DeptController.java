package com.hxr.springcloud.controller;

import com.hxr.springcloud.entity.Dept;
import com.hxr.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: DeptController
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 17:25
 * @Version: 1.0
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService = null;

    @Autowired
    private DiscoveryClient discoveryClient;


    @PostMapping(value = "/dept/add")
    public Boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return  deptService.findById(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        System.out.println(deptService.findAll());
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     * @return
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务"+list.size());

        //查询STUDY-SPRINGCLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("STUDY-SPRINGCLOUD-DEPT");

        //打印STUDY-SPRINGCLOUD-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }

}
