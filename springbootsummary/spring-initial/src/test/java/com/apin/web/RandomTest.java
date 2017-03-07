package com.apin.web;

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
public class RandomTest {

    @Autowired
    private Random random;

    @Test
    public void test(){
        System.out.println("String:"+random.getRandomString());
        System.out.println("Integer:"+random.getRandomInt());
        System.out.println("Long:"+random.getRandomLong());
        System.out.println("IntegerLimit:"+random.getRandomMax());
        System.out.println("IntegerMinMax:"+random.getRandomMinMax());
    }
}