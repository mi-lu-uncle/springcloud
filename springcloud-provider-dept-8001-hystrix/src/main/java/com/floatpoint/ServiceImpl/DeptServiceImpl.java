package com.floatpoint.ServiceImpl;

import com.floatpoint.Service.DeptService;
import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import com.floatpoint.mapper.DeptMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  private DeptMapper deptMapper;

  @Override
  @HystrixCommand(fallbackMethod = "getDeptByNo_hystrix")
  public Dept getDeptByNo(int no) {
    Dept dept = deptMapper.selectByPrimaryKey(no);
    if(null == dept){
      throw new RuntimeException("该no 无法查找到dept信息!");
    }
    return dept;
  }

  private Dept getDeptByNo_hystrix(int no,Exception e){
    return new Dept().setDeptno(no).setDeptname(e.getMessage());
  }

  @Override
  public int addDept(DeptDto dto) {
    try {
      Dept record = new Dept();
      BeanUtils.copyProperties(dto,record);
      deptMapper.insert(record);
    } catch (BeansException e) {
      e.printStackTrace();
      return 1;
    }
    return 0;
  }

  @Override
  public int deleteDeptBy(int no) {
    try {
      deptMapper.deleteByPrimaryKey(no);
    } catch (Exception e) {
      e.printStackTrace();
      return 1;
    }

    return 0;
  }
}
