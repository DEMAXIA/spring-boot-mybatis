package com.teemo.controller;

import com.teemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anni on 2016/10/25.
 */

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private UserService userService ;

    @RequestMapping("/test")
    public Object test(){
        return userService.getUsers() ;
    }
}
