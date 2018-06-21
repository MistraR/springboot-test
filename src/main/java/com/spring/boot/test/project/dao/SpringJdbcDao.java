package com.spring.boot.test.project.dao;

import com.spring.boot.test.project.entity.SpringJdbcEntity;

import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe: Spring  JdbcTemplate  测试dao
 */
public interface SpringJdbcDao {

    int add(SpringJdbcEntity springJdbcEntity);

    int update(SpringJdbcEntity springJdbcEntity);

    int delete(Long id);

    SpringJdbcEntity findAccountById(Long id);

    List<SpringJdbcEntity> findAccountList();
}
