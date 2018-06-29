package com.spring.boot.test.cache.service;

import com.spring.boot.test.cache.entity.CacheEntity;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
public interface CacheService {

    CacheEntity save(CacheEntity cacheEntity);

    void remove(Long id);

    CacheEntity findOne(CacheEntity cacheEntity);
}
