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

  @PostMapping("/add")
  public String addDept(@RequestBody DeptDto dto){

    int i = deptService.addDept(dto);
    if ( i == 1){
      return "add fail";
    }
    return "add successful";
  }

  @GetMapping("/delete/{no}")
  public String deleteDeptByNo(@PathVariable("no") int no){
    int i = deptService.deleteDeptBy(no);
    if ( i == 1){
      return "delete fail";
    }
    return "delete successful";
  }

}
