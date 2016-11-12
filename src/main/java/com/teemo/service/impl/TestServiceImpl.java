package com.teemo.service.impl;

import com.teemo.service.TestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Anni on 2016/10/28.
 */

@Service
public class TestServiceImpl  implements TestService{


    @Override

    @Cacheable(value = "sessionId")
    public String getSeesionId(String sessionId) {
        return sessionId;
    }
}
