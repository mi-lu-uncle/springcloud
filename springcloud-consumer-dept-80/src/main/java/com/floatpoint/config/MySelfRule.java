package com.floatpoint.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡策略：注意这个类不要放在@ComponentScan注解能扫描到的同级目录和子包目录下面：也就是不要放在主启动类同级和子包目录下面
 * 这样会被整个ribbon客户端共享，所以无法达到自定义算法的目的。
 *
 */
//参考地址：https://my.oschina.net/hmilyylimh/blog/1539507
@Configuration
@ExcludeFromComponentScan
public class MySelfRule {

  @Bean
  public IRule ribbonRule(){
    return new RandomRule();//随机算法。
  }
}
