package com.floatpoint.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept {
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

    public Dept(Integer deptno, String deptname, String dbSource) {
        this.deptno = deptno;
        this.deptname = deptname;
        this.dbSource = dbSource;
    }
}