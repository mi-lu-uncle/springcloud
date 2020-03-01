package com.floatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//客户端启动类
public class SpringCloudCosumerApplication_80 {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudCosumerApplication_80.class,args);
  }
}
