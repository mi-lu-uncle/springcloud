package com.floatpoint.controller;

import com.floatpoint.commons.ServiceName;
import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import com.floatpoint.service.DeptClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者内部是不需要service层的，直接消费提供者
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class DeptController_consumer {

  @Autowired
  private DeptClientService deptClientService;

  @GetMapping("/get/{no}")
  public Dept getByNo(@PathVariable("no") int no){
    log.info("请求前缀地址为："+ServiceName.SERVICE_NAME_8001);
    return deptClientService.getDeptByNo(no);
  }

  @PostMapping("/add")
  public String addDept(@RequestBody DeptDto dto){
    int i = deptClientService.addDept(dto);
    if ( i == 1){
      return "add fail";
    }
    return "add successful";
  }

  @GetMapping("/delete/{no}")
  public String deleteDeptByNo(@PathVariable("no") int no){
    int i = deptClientService.deleteDeptBy(no);
    if ( i == 1){
      return "delete fail";
    }
    return "delete successful";
  }

}
