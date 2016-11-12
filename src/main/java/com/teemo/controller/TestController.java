package com.teemo.controller;

import com.teemo.service.TestService;
import com.teemo.service.UserService;
import com.teemo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Anni on 2016/10/25.
 */

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private UserService userService ;

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Object test(){
        return userService.getUsers() ;
    }

    @RequestMapping("/getSessionId")
    public String getSessionId(HttpSession session){
        return testService.getSeesionId(session.getId());

    }

}
