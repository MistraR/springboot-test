package com.spring.boot.test.beanInitDestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe: 测试bean的初始化和销毁
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        context.close();
    }

}