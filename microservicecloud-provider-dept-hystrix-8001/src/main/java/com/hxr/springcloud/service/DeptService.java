package com.hxr.springcloud.service;

import com.hxr.springcloud.entity.Dept;

import java.util.List;

/**
 * @ClassName: DeptService
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 17:21
 * @Version: 1.0
 **/
public interface DeptService {
    Boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
