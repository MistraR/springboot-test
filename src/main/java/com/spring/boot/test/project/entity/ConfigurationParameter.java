package com.spring.boot.test.project.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe: 配置文件参数映射到实体类
 * 需要在应用主类加注解 @EnableConfigurationProperties({ConfigurationParameter.class})
 */
@Component
@ConfigurationProperties(prefix = "pojo")
@Data
public class ConfigurationParameter {

    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String describe;
}
