package com.spring.boot.test.project.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe: 配置文件不管用.properties还是.yml格式的，前缀必须要唯一
 * .properties格式的属性注入到实体类时，中文会是乱码
 * 要用自定义的配置文件注入属性时用.properties格式的配置文件，自定义的.yml格式的配置文件会注入失败，application.yml就没有这个问题
 */
@Data
@Component
@ConfigurationProperties(prefix = "pojo2")
@PropertySource(value = "classpath:customProperties.properties")
public class ConfigurationParameter2 {

    private String name;
    private int age;
    private int number;
    private String describe;
}
