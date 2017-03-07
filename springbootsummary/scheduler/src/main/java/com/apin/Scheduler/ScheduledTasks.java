package com.apin.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/16.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate=5000)
//    @Scheduled(fixedDelay=5000)
//    @Scheduled(initialDelay=1000, fixedRate=5000)
//    @Scheduled(cron="*/5 * * * * *")
    public void reportCurrentTime(){
        System.out.println("现在时间：" + simpleDateFormat.format(new Date()));
    }
}
