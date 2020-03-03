package com.floatpoint.service;

import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "PROVIDER-DEPT")//微服务名称
public interface DeptClientService {

  Dept getDeptByNo(int no);

  int addDept(DeptDto dto);

  int deleteDeptBy(int no);

}
