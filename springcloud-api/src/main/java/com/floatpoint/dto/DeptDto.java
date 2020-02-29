package com.floatpoint.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class DeptDto implements Serializable {
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

  public DeptDto(Integer deptno, String deptname, String dbSource) {
    this.deptno = deptno;
    this.deptname = deptname;
    this.dbSource = dbSource;
  }
}
