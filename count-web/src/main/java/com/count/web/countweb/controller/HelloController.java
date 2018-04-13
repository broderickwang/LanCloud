package com.count.web.countweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/4/13
 * @Description: ${todo}
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        LOGGER.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "hello";
    }
}
