package com.apin.database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourceConfigTest {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Before
    public void setUp() throws Exception {
        jdbcTemplate1.update("delete from person ");
        jdbcTemplate2.update("delete from person ");
    }

    @Test
    public void test() throws Exception{
        jdbcTemplate1.update("insert into person(name,age) values(?,?)","zhangcheng",27);
        jdbcTemplate2.update("insert into person(name,age) values(?,?)","xiaorange",28);

        Assert.assertEquals("1",jdbcTemplate1.queryForObject("select count(1) from person", String.class));

        Assert.assertEquals("1",jdbcTemplate2.queryForObject("select count(1) from person",String.class));

    }
}