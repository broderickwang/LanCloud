package com.lancoder.feign.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/9/12
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
//FeignClient注解是 注册到注册中心的服务名称
@FeignClient("COUNT-SERVER")
public interface HelloService {

    //RequestMapping 是转接到确切的服务的URL
    @RequestMapping("/count/server/hello")
    String hello();
}

