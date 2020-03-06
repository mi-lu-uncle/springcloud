package com.floatpoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.floatpoint.mapper"})
@EnableEurekaClient //在服务启动后自动注册到eureka中
@EnableCircuitBreaker
public class SpringCloudApplication_8001_Hystrix {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudApplication_8001_Hystrix.class,args);
  }
}
