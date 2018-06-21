package com.spring.boot.test.project.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
@PropertySource(value = "classpath:customProperties.yml")
public class ConfigurationParameter2 {

    private String name;
    private int age;
}
