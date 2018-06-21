package com.spring.boot.test.project.service.impl;

import com.spring.boot.test.project.dao.SpringJdbcDao;
import com.spring.boot.test.project.entity.SpringJdbcEntity;
import com.spring.boot.test.project.service.SpringJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Service
public class SpringJdbcServiceImpl implements SpringJdbcService {

    @Autowired
    private SpringJdbcDao springJdbcDao;

    @Override
    public int add(SpringJdbcEntity springJdbcEntity) {
        return springJdbcDao.add(springJdbcEntity);
    }

    @Override
    public int update(SpringJdbcEntity springJdbcEntity) {
        return springJdbcDao.update(springJdbcEntity);
    }

    @Override
    public int delete(Long id) {
        return springJdbcDao.delete(id);
    }

    @Override
    public SpringJdbcEntity findAccountById(Long id) {
        return springJdbcDao.findAccountById(id);
    }

    @Override
    public List<SpringJdbcEntity> findAccountList() {
        return springJdbcDao.findAccountList();
    }
}
