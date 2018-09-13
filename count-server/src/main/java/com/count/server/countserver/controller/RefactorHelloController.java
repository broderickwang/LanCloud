package com.count.server.countserver.controller;

import com.lancoder.service.api.serviceapi.dto.User;
import com.lancoder.service.api.serviceapi.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/9/13
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String Hello(String name) {
        return "Hello "+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return user.toString();
    }
}
