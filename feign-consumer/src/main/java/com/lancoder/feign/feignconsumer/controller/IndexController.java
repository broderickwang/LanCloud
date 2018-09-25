package com.lancoder.feign.feignconsumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***********************************
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com 
 * @date: 2018-9-21  
 * @Description:
 * @version: V1.0
 ***********************************/
@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("")
    public String index(){
        return "/index";
    }

    @GetMapping("/card")
    public String cards(){
        return "/demos/card";
    }
}
