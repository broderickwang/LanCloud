package com.count.server.countserver.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/4/18
 * @Description:
 * @version: V1.0
 */
@RestController
@RequestMapping("/count/server/")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello,this is from count server!";
    }
}
