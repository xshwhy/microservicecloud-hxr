package com.hxr.springcloud.dao;

import com.hxr.springcloud.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DeptDao
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 17:09
 * @Version: 1.0
 **/

@Repository
public interface DeptDao  {

      Boolean addDept(Dept dept);

      Dept findById(Long id);

      List<Dept> findAll();


}
