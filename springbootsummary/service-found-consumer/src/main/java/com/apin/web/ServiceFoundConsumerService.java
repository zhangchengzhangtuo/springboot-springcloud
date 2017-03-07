package com.apin.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/3/6.
 */
@Service
public class ServiceFoundConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://computer-service//add?a=10&b=20",String.class).getBody();
    }

   private String addServiceFallback(){
        return "error";
    }
}
