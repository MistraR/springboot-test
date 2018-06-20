package com.spring.boot.test.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/20/020
 * Describe:
 */
@Api("MistraController")
@RestController
@RequestMapping("/mistra")
public class MistraController {

    @Value("${my.name}")
    private String myName;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    private String test() {
        return myName;
    }
}
