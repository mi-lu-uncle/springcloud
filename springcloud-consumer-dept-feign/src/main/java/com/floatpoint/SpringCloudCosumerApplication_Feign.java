package com.floatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//客户端启动类
@EnableFeignClients(basePackages = {"com.floatpoint"})
public class SpringCloudCosumerApplication_Feign {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudCosumerApplication_Feign.class,args);
  }
}
