package com.spring.boot.test.cache.dao;

import com.spring.boot.test.cache.entity.CacheEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
public interface CacheRepository extends JpaRepository<CacheEntity,Long> {
}
