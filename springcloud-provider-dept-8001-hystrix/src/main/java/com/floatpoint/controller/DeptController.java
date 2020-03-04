package com.floatpoint.controller;

import com.floatpoint.Service.DeptService;
import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DeptController {

  @Autowired
  private DeptService deptService;

  @GetMapping("/get/{no}")
  public Dept getByNo(@PathVariable("no") int no){
    return deptService.getDeptByNo(no);
  }

}
