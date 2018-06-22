package com.spring.boot.test.springMVC;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Controller
@Api("SpringMVC测试")
public class HelloController {

    @ApiOperation("index")
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}