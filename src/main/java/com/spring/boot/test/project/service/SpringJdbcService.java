package com.spring.boot.test.project.service;

import com.spring.boot.test.project.entity.SpringJdbcEntity;

import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
public interface SpringJdbcService {

    int add(SpringJdbcEntity springJdbcEntity);

    int update(SpringJdbcEntity springJdbcEntity);

    int delete(int id);

    SpringJdbcEntity findAccountById(int id);

    List<SpringJdbcEntity> findAccountList();
}
