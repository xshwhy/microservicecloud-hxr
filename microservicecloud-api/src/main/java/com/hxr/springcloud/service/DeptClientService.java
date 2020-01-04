package com.hxr.springcloud.service;

import com.hxr.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: DeptService
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-03 12:59
 * @Version: 1.0
 **/
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
     Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
     List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
     Boolean add (Dept dept);
}
