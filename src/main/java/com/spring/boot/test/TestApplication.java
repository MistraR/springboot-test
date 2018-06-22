package com.spring.boot.test;

import com.spring.boot.test.project.entity.ConfigurationParameter;
import com.spring.boot.test.project.entity.ConfigurationParameter2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

/**
 * @SpringBootApplication 包含3个注解
 * 1: @EnableAutoConfiguration 根据类路径中的jar包依赖为当前项目进行自动配置
 * 2: @SpringBootConfiguration 继承自@Configuration，二者功能也一致，标注当前类是配置类
 * 3: @ComponentScan 注解会自动扫描指定包下的全部标有 @Component注解 的类，并注册成bean
 */
@SpringBootApplication(scanBasePackages = "com.spring.boot.test")
@EnableConfigurationProperties({ConfigurationParameter.class,ConfigurationParameter2.class})
//开启调度任务
@EnableScheduling
public class TestApplication {

    public static void main(String[] args) {
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆   RoronoaZoro丶小王瑞   ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
        SpringApplication.run(TestApplication.class, args);
    }

    /**
     * 需要在容器启动的时候执行一些内容，比如：读取配置文件信息，数据库连接，删除临时文件，清除缓存信息，
     * 在Spring框架下是通过ApplicationListener监听器来实现的。
     * 在Spring Boot中为CommandLineRunner接口
     * 执行时机为容器启动完成的时候
     * @param applicationContext
     * @return
     */
    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = applicationContext.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }*/
}
