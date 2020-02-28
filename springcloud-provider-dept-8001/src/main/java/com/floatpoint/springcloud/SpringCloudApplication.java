package com.floatpoint.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.floatpoint.springcloud.mapper.*"})
public class SpringCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudApplication.class,args);
  }
}
