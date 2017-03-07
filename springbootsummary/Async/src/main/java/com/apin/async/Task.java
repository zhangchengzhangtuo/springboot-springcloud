package com.apin.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Administrator on 2017/2/16.
 */
@Component
public class Task {

    private static final Logger logger= LoggerFactory.getLogger(Task.class);

    public static Random random=new Random();

    public void doTaskOne() throws Exception{
        logger.debug("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.debug("完成任务一，耗时：" + (end - start) + "毫秒");
    }

    public void doTaskTwo() throws Exception{
        logger.debug("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.debug("完成任务二，耗时：" + (end - start) + "毫秒");
    }

    public void doTaskThree() throws Exception{
        logger.debug("开始做任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.debug("完成任务三，耗时：" + (end - start) + "毫秒");
    }
}
