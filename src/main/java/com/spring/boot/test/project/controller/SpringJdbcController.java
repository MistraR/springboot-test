package com.spring.boot.test.project.controller;

import com.spring.boot.test.project.entity.SpringJdbcEntity;
import com.spring.boot.test.project.service.SpringJdbcService;
import com.spring.boot.test.util.web.annotation.AddUrl;
import com.spring.boot.test.util.web.annotation.GetOneUrl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@RestController
@RequestMapping("/springJdbcController")
@Api("Spring JdbcTemplate 测试")
public class SpringJdbcController {

    @Autowired
    private SpringJdbcService springJdbcService;

    @ApiOperation("获取list")
    @GetOneUrl
    public List<SpringJdbcEntity> getAccounts() {
        return springJdbcService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation("获取单个")
    public SpringJdbcEntity getAccountById(@PathVariable("id") int id) {
        return springJdbcService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ApiOperation("更新")
    public String updateAccount(@PathVariable("id") Long id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) String money) {
        SpringJdbcEntity springJdbcEntity = new SpringJdbcEntity();
        springJdbcEntity.setMoney(money);
        springJdbcEntity.setName(name);
        springJdbcEntity.setId(id);
        int t = springJdbcService.update(springJdbcEntity);
        if (t == 1) {
            return springJdbcEntity.toString();
        } else {
            return "fail";
        }
    }

    @AddUrl
    @ApiOperation("新增")
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") String money) {
        SpringJdbcEntity springJdbcEntity = new SpringJdbcEntity();
        springJdbcEntity.setMoney(money);
        springJdbcEntity.setName(name);
        int t = springJdbcService.add(springJdbcEntity);
        if (t == 1) {
            return springJdbcEntity.toString();
        } else {
            return "fail";
        }
    }
}
