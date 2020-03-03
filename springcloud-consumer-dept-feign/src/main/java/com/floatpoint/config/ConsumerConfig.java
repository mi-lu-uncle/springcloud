package com.floatpoint.config;

//@Configuration
public class ConsumerConfig {

  /**
   * 注入rest调用模板，进行http调用。
   * @return
   */
//  @Bean
//  @LoadBalanced  //@LoadBalanced开启以别名方式去Eureka读取注册信息，然后本地实现rpc远程调用
//  public RestTemplate restTemplate(){
//    return new RestTemplate();
//  }

    //直接注入一个负载均衡策略，替代默认的轮询策略
//  @Bean
//  public IRule getRule(){
//    return new RandomRule();//返回一个随机算法，替代默认的轮询算法。
//  }

}
