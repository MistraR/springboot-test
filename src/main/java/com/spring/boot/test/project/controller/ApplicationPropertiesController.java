package com.spring.boot.test.project.controller;

import com.spring.boot.test.project.entity.ConfigurationParameter;
import com.spring.boot.test.project.entity.ConfigurationParameter2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@RestController
@Api("配置参数测试控制器")
@RequestMapping("/applicationProperties")
public class ApplicationPropertiesController {

    @Autowired
    private ConfigurationParameter configurationParameter;

    @Autowired
    private ConfigurationParameter2 configurationParameter2;

    @Value("${my.name}")
    private String myName;

    @ApiOperation("配置文件参数注入")
    @GetMapping("/test")
    public String test() {
        return myName;
    }

    @ApiOperation("测试配置文件参数映射到实体类")
    @GetMapping("/applicationProperties")
    public ConfigurationParameter applicationProperties(){
        return configurationParameter;
    }

    @ApiOperation("测试自定义配置文件参数映射到实体类")
    @GetMapping("/applicationProperties2")
    public ConfigurationParameter2 applicationProperties2(){
        return configurationParameter2;
    }
}
