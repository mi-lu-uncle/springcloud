package com.floatpoint.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
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
  @LoadBalanced  //@LoadBalanced开启以别名方式去Eureka读取注册信息，,ribbon是客户端，实现负载均衡的工具。
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

    //直接注入一个负载均衡策略，替代默认的轮询策略
//  @Bean
//  public IRule getRule(){
//    return new RandomRule();//返回一个随机算法，替代默认的轮询算法。
//  }

}
