package com.apin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/3/6.
 */
@RestController
public class ServiceFoundConsumerController {

    @Autowired
    private ServiceFoundConsumerService serviceFoundConsumerService;

    @RequestMapping(value="/add",method= RequestMethod.GET)
    public String add(){
        return serviceFoundConsumerService.addService();
    }
}
