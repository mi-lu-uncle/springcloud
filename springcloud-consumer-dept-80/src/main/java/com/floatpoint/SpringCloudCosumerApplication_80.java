package com.floatpoint;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient//客户端启动类
@RibbonClients(value = {
        @RibbonClient(name = "PROVIDER-DEPT",configuration = MySelfRule.class)
})
//通过注解配置给PROVIDER-DEPT的微服务自定义负载均衡策略。策略类为MySelfRule.class
public class SpringCloudCosumerApplication_80 {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudCosumerApplication_80.class,args);
  }
}
