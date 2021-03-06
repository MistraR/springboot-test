package com.spring.boot.test.project.controller;

import com.spring.boot.test.project.entity.ConfigurationParameter;
import com.spring.boot.test.project.entity.SpringJdbcEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/20/020
 * Describe:
 */
@Api("MistraController")
@RestController
@RequestMapping(value = "/mistra")
public class MistraController {

    @ApiOperation("启动测试")
    @GetMapping(value = "/test")
    public String test() {
        return "☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆  项目启动成功1  ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆";
    }

    @ApiOperation("返回实体类")
    @GetMapping("/entity")
    public SpringJdbcEntity entity(){
        SpringJdbcEntity springJdbcEntity = new SpringJdbcEntity();
        springJdbcEntity.setMoney("2500");
        springJdbcEntity.setName("项目启动成功");
        return springJdbcEntity;
    }
}
