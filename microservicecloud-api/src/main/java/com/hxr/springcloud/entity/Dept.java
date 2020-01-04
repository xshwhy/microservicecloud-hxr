package com.hxr.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName: Dept
 * @Description:
 * @Author: xsh
 * @Date: 2019-12-27 14:12
 * @Version: 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) // 链式风格访问
public class Dept implements Serializable {

    private Long deptno; // 主键

    private String dname; // 部门名称

    private String db_source; // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一信息被存储到不同数据库
}
