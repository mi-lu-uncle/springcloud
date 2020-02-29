package com.floatpoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.floatpoint.mapper"})
public class SpringCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudApplication.class,args);
  }
}
