package com.spring.boot.test.cache.controller;

import com.spring.boot.test.cache.entity.CacheEntity;
import com.spring.boot.test.cache.service.CacheService;
import com.spring.boot.test.util.web.annotation.AddUrl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
@RestController
@RequestMapping("/cache")
@Api("缓存测试")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @ApiOperation("新增并添加缓存cachePut")
    @PostMapping("/cachePut")
    public CacheEntity put(CacheEntity cacheEntity) {
        return cacheService.save(cacheEntity);
    }

    @ApiOperation("cacheable")
    @GetMapping("/cacheable")
    public CacheEntity cacheable(CacheEntity cacheEntity) {
        return cacheService.findOne(cacheEntity);
    }

    @ApiOperation("cacheEvict")
    @GetMapping("/cacheEvict")
    public String cacheEvict(Long id) {
        cacheService.remove(id);
        return "删除了id、key为" + id + "的数据缓存";
    }

}
