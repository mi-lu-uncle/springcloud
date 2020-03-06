package com.floatpoint.Service;

import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;

public interface DeptService {

  Dept getDeptByNo(int no);

  int addDept(DeptDto dto);

  int deleteDeptBy(int no);

}
