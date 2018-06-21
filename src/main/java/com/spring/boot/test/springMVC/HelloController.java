package com.spring.boot.test.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}