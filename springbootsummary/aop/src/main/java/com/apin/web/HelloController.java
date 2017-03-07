package com.apin.web;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/2/17.
 */
@RestController
public class HelloController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name){
        return "Hello "+name;
    }
}
