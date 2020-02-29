package com.floatpoint.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {//基于微服务调用的都必须序列化
    /**
     * 部门编号
     */
    private Integer deptno;

    /**
     * 部门名称
     */
    private String deptname;

    /**
     * 数据库标识
     */
    private String dbSource;
}