package com.spring.boot.test.cache.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/27/027
 * Describe:
 */
@Entity
@Data
public class CacheEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String note;
}
