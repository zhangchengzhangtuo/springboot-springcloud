package com.apin;

import com.apin.redis.User;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisApplicationTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,User> redisTemplate;

    @Test
    public void test() throws Exception{
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void test1() throws Throwable{
        User user=new User("chaoren",20);
        redisTemplate.opsForValue().set(user.getUsername(),user);

        user=new User("bianfuxia",30);
        redisTemplate.opsForValue().set(user.getUsername(),user);

        user=new User("zhizhuxia",40);
        redisTemplate.opsForValue().set(user.getUsername(),user);

        Assert.assertEquals(20,redisTemplate.opsForValue().get("chaoren").getAge().longValue());
        Assert.assertEquals(30,redisTemplate.opsForValue().get("bianfuxia").getAge().longValue());
        Assert.assertEquals(40,redisTemplate.opsForValue().get("zhizhuxia").getAge().longValue());
    }

}