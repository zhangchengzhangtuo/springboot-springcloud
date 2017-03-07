package com.apin.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/15.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into person (name,age) values(?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from person where name=?",name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from person",Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from person");
    }
}
