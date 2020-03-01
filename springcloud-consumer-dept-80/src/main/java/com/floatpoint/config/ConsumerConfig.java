package com.floatpoint.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConsumerConfig {

  /**
   * 注入rest调用模板，进行http调用。
   * @return
   */
  @Bean
  @LoadBalanced  //@LoadBalanced开启以别名方式去Eureka读取注册信息，然后本地实现rpc远程调用
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }


}
