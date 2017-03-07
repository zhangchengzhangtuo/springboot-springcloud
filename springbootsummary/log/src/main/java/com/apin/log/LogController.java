package com.apin.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/17.
 */
@RestController
public class LogController {

//    private final static Logger logger= LoggerFactory.getLogger(LogController.class);

    private final static Logger logger2= LogManager.getLogger(LogController.class.getName());

    @RequestMapping(value="/log",method= RequestMethod.POST)
    public String logPost(@RequestParam(value="message",required = false)String message  ){
//        logger.debug("log4j request message:{}",message);
        logger2.debug("log4j2 request message:"+message);
        return "success";
    }
}
