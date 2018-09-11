package com.lancoder.loadbalance.controller;

import com.lancoder.loadbalance.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/4/15
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String add(){
        int a = 0;
        return restTemplate.getForEntity("http://COUNT-WEB/add?a=10&b=10", String.class).getBody();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test(){
        return restTemplate.getForEntity("http://COUNT-WEB/hello",String.class).getBody();
    }

    @RequestMapping(value = "/server/hello",method = RequestMethod.GET)
    public String serverHello(){
//        return restTemplate.getForEntity("http://COUNT-SERVER/count/server/hello",String.class).getBody();
        return helloService.helloService();
    }

}
