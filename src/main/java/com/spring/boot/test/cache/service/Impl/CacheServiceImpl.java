package com.spring.boot.test.cache.service.Impl;

import com.spring.boot.test.cache.dao.CacheRepository;
import com.spring.boot.test.cache.entity.CacheEntity;
import com.spring.boot.test.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private CacheRepository cacheRepository;

    @Override
    //@CachePut新增或更新数据到缓存，缓存名称为cache
    //若没有指定key，方法参数作为key保存到缓存中
    @CachePut(value = "cache", key = "#cacheEntity.id")
    public CacheEntity save(CacheEntity cacheEntity) {
        CacheEntity c = cacheRepository.save(cacheEntity);
        System.out.println("为id、key为" + cacheEntity.getId() + "的数据做了缓存");
        return c;
    }

    @Override
    //@CacheEvict从缓存cache中删除key为id的数据
    @CacheEvict(value = "cache",key = "#id")

    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        //cacheRepository.deleteById(id);
    }

    @Override
    //@Cacheable缓存key为id的数据到缓存cache中
    @Cacheable(value = "cache", key = "#cacheEntity.id")
    public CacheEntity findOne(CacheEntity cacheEntity) {
        CacheEntity c = cacheRepository.findById(cacheEntity.getId()).get();
        System.out.println("为id、key为" + cacheEntity.getId() + "的数据做了缓存");
        return c;
    }
}
