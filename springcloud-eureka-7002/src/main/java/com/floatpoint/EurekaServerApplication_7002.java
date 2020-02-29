package com.floatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//eureka服务端的启动类,集群搭建
public class EurekaServerApplication_7002 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication_7002.class,args);
  }
}
