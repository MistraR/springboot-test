package com.spring.boot.test.beanInitDestory;

import org.springframework.stereotype.Component;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Component
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数 - BeanWayService");
    }

    public void destory() {
        System.out.println("@Bean-destory-method");
    }
}