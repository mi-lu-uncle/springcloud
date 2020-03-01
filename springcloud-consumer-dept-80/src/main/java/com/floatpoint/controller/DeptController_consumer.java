package com.floatpoint.controller;

import com.floatpoint.commons.ServiceName;
import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
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

//  配置ribbon后可以直接通过微服务的名称进行访问，这里不需要了
//  @Value("${url.prexfix}")
//  private String urlprex;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/get/{no}")
  public Dept getByNo(@PathVariable("no") int no){
    log.info("请求前缀地址为："+ServiceName.SERVICE_NAME_8001);
    return restTemplate.getForObject(ServiceName.SERVICE_NAME_8001 +"/dept/get/"+no,Dept.class);
  }

  @PostMapping("/add")
  public String addDept(@RequestBody DeptDto dto){
    return restTemplate.postForObject(ServiceName.SERVICE_NAME_8001+"/dept/add",dto,String.class);
  }

  @GetMapping("/delete/{no}")
  public String deleteDeptByNo(@PathVariable("no") int no){
    return restTemplate.getForObject(ServiceName.SERVICE_NAME_8001+"/dept/delete"+no,String.class);
  }

}
