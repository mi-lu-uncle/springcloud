package com.floatpoint.config;

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
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

}
