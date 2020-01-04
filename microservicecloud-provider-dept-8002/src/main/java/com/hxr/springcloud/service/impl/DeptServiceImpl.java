package com.hxr.springcloud.service.impl;

import com.hxr.springcloud.dao.DeptDao;
import com.hxr.springcloud.entity.Dept;
import com.hxr.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 17:22
 * @Version: 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
