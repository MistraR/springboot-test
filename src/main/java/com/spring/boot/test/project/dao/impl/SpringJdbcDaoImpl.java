package com.spring.boot.test.project.dao.impl;

import com.spring.boot.test.project.dao.SpringJdbcDao;
import com.spring.boot.test.project.entity.SpringJdbcEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/21/021
 * Describe:
 */
@Repository
public class SpringJdbcDaoImpl implements SpringJdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(SpringJdbcEntity springJdbcEntity) {
        return jdbcTemplate.update("insert into springjdbc(name, money) values(?, ?)", springJdbcEntity.getName(), springJdbcEntity.getMoney());
    }

    @Override
    public int update(SpringJdbcEntity springJdbcEntity) {
        return jdbcTemplate.update("UPDATE  springjdbc SET NAME=? ,money=? WHERE id=?",
                springJdbcEntity.getName(), springJdbcEntity.getMoney(), springJdbcEntity.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from springjdbc where id=?", id);
    }

    @Override
    public SpringJdbcEntity findAccountById(int id) {
        List<SpringJdbcEntity> list = jdbcTemplate.query("select * from springjdbc where id = ?", new Object[]{id}, new BeanPropertyRowMapper(SpringJdbcEntity.class));
        if (list != null && list.size() > 0) {
            SpringJdbcEntity springJdbcEntity = list.get(0);
            return springJdbcEntity;
        } else {
            return null;
        }
    }

    @Override
    public List<SpringJdbcEntity> findAccountList() {
        List<SpringJdbcEntity> list = jdbcTemplate.query("select * from springjdbc", new Object[]{}, new BeanPropertyRowMapper(SpringJdbcEntity.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
