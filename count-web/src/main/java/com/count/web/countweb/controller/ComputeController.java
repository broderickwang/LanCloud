package com.count.web.countweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
public class ComputeController {

    static final Logger LOGGER = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a , @RequestParam Integer b){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        LOGGER.info("/add,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return r;
    }

    @RequestMapping(value = "/tUser",method = RequestMethod.GET)
    public String tUer(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://COUNT-SERVER/tUser?name={1}",String.class,"didi");
        String body = responseEntity.getBody();
        return body;
    }

}
