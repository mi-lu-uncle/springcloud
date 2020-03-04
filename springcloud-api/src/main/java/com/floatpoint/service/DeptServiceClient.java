package com.floatpoint.service;

import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * feign使用
 */
@Component
@FeignClient(value = "PROVIDER-DEPT")//指定要调用的微服务名称
@RequestMapping("/dept")
public interface DeptServiceClient {

  //然后根据指定的微服务名称里面去请求对应的controller类进行通信
  //openfeign支持springmvc的注解
  @GetMapping(value = "/get/{no}")//,produces = {"application/json;charset=UTF-8"}：代表方法返回值类型
  public Dept getByNo(@PathVariable("no") int no);

  @PostMapping(value = "/add" )//,produces = {"application/json;charset=UTF-8"}
  public String addDept(@RequestBody DeptDto dto);

  @GetMapping(value = "/delete/{no}")//,produces = {"application/json;charset=UTF-8"}
  public String deleteDeptByNo(@PathVariable("no") int no);

}
