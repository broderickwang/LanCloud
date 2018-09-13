package com.lancoder.service.api.serviceapi.service;

import com.lancoder.service.api.serviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/9/13
 * @Description:
 * @Copyright: 2018 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */

@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String Hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    User hello(@RequestHeader("name")String name,@RequestHeader("age")Integer age);

    @RequestMapping(value = "/hello6",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
