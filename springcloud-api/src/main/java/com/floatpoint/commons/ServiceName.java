package com.floatpoint.commons;

import java.io.Serializable;

/**
 * 此类定义微服务提供者的地址
 */
public class ServiceName implements Serializable {

  public static final String SERVICE_NAME_8001 = "http://provider-dept"; //这里的微服务名称对于server.name ：忽略大小写

}
