package com.spring.boot.test.applicationRunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/20/020
 * Describe: CommandLineRunner、ApplicationRunner 接口是在容器启动成功后的最后一步回调（类似开机自启动）。
 */
@Component
@Order(value = 1)
public class MyStartUpRunner2 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆  测试ApplicationRunner");
    }
}
