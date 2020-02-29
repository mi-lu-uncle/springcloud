package com.floatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//eureka服务端的启动类
public class EurekaServerApplication_7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication_7001.class,args);
  }
}
