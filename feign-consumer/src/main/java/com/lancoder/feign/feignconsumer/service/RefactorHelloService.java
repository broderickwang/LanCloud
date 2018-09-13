package com.lancoder.feign.feignconsumer.service;

import com.lancoder.service.api.serviceapi.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/9/13
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@FeignClient("COUNT-SERVER")
public interface RefactorHelloService extends HelloService{
}
