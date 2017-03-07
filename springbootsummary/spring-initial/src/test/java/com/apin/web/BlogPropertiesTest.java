package com.apin.web;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogPropertiesTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test() throws Exception{
        Assert.assertEquals(blogProperties.getName(),"GG");
        Assert.assertEquals(blogProperties.getTitle(),"SpringBoot");
    }
}