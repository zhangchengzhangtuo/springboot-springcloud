package com.apin.dynamic.log;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/17.
 */
@RestController
public class HelloController {

    private Logger logger= Logger.getLogger(getClass());

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String testLogLevel(){
        logger.debug("Logger Level:DEBUG");
        logger.info("Logger Level:INFO");
        logger.error("Logger Level:ERROR");
        return "success";
    }



}
