package com.count.server.countserver.fallback;

import com.lancoder.service.api.serviceapi.dto.User;
import com.lancoder.service.api.serviceapi.service.HelloService;

/***********************************
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com 
 * @date: 2018-9-20  
 * @Description:
 * @version: V1.0
 ***********************************/
public class BaseFallback implements HelloService {
    @Override
    public String Hello(String name) {
        return "BaseFallback";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("BaseFallback",12);
    }

    @Override
    public String hello(User user) {
        return "hello BaseFallback";
    }
}
