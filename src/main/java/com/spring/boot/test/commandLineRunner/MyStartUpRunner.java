package com.spring.boot.test.commandLineRunner;

import com.spring.boot.test.springUtil.SpringContextUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/20/020
 * Describe: 需要在容器启动的时候执行一些内容，比如：读取配置文件信息，数据库连接，删除临时文件，清除缓存信息，
 * 在Spring框架下是通过ApplicationListener监听器来实现的。
 * 在Spring Boot中为CommandLineRunner接口
 * <p>
 * 执行时机为容器启动完成的时候
 */
@Component
public class MyStartUpRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆  服务启动执行，输出Spring实例化了哪些Bean  ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆  SpringContextUtil.getApplicationContext():  " + SpringContextUtil.getApplicationContext());
        String[] beanNames = SpringContextUtil.getApplicationContext().getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
