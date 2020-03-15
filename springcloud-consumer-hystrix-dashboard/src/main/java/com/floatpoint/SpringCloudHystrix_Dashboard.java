package com.floatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrixDashboard//开启仪表盘注解
public class SpringCloudHystrix_Dashboard {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudHystrix_Dashboard.class,args);
  }
}
