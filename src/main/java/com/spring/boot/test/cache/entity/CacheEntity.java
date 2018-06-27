package com.spring.boot.test.cache.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
@Entity
public class CacheEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String note;
}
