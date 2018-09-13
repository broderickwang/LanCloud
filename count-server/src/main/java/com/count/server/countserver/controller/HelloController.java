package com.count.server.countserver.controller;

import com.count.server.countserver.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * @project: LanCloud
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2018/4/18
 * @Description:
 * @version: V1.0
 */
@RestController
@RequestMapping("/count/server/")
public class HelloController {

//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "Hello,this is from count server!";
    }

    @GetMapping("/getUser")
    public User getUser(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }

    @PostMapping("/user/str")
    public String getU(@RequestBody User user){
        return user.toString();
    }

}
