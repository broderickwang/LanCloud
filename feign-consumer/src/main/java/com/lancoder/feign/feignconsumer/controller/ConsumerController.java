package com.lancoder.feign.feignconsumer.controller;

import com.lancoder.feign.feignconsumer.domain.User;
import com.lancoder.feign.feignconsumer.service.HelloService;
import com.lancoder.feign.feignconsumer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/9/12
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;


    @Autowired
    RefactorHelloService refactorHelloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }

    @GetMapping("/feign-getUser")
    public User getUser(){
        return helloService.getUser("wangchengda",28);
    }

    @GetMapping("/feign-user/str")
    public String userStr(){
        return helloService.getU(new User("xianliwei",28));
    }

    @GetMapping("/feign-user/serive/api")
    public String helloConsumer2(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(refactorHelloService.Hello("LanCoder")+"\n");
        stringBuffer.append(refactorHelloService.hello("LanCoder",28)+"\n");
        stringBuffer.append(refactorHelloService.hello(new com.lancoder.service.api.serviceapi.dto.User("Hannan",28)));
        return stringBuffer.toString();
    }
}
