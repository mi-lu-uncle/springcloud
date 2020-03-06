package com.floatpoint.service.fallbackfactory;

import com.floatpoint.dto.DeptDto;
import com.floatpoint.entity.Dept;
import com.floatpoint.service.DeptServiceClient;
import feign.hystrix.FallbackFactory;

/**
 *不要再这个类上加上@component注解，否则不生效
 */
public class DeptServiceClientFallBackFactory implements FallbackFactory<DeptServiceClient> {
  @Override
  public DeptServiceClient create(Throwable throwable) {
    return new DeptServiceClient() {
      @Override
      public Dept getByNo(int no) {
        return new Dept().setDbSource("使用aop思想进行服务降级处理，达到解耦合的目的！");
      }

      @Override
      public String addDept(DeptDto dto) {
        return null;
      }

      @Override
      public String deleteDeptByNo(int no) {
        return null;
      }
    };
  }
}
