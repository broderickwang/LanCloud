package com.lancoder.feign.feignconsumer.service;

import com.lancoder.feign.feignconsumer.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/count/server/getUser")
    User getUser(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping(value = "/count/server/user/str",method = RequestMethod.POST)
    String getU(@RequestBody User user);

}

