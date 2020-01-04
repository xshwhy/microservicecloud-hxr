package com.hxr.springcloud.controller;

import com.hxr.springcloud.entity.Dept;
import com.hxr.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private DeptClientService service = null; // Feign面向接口编程

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return this.service.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

    @PostMapping(value = "/consumer/dept/add")
    public Boolean add (Dept dept) {
      return   this.service.add(dept);
    }

}
