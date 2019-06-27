package com.jack.dubbo.service.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jack.dubbo.service.api.UserServiceApi;

@Service
public class UserServiceImpl implements UserServiceApi {
    @Override
    public String getUserName(String id) {
        System.out.println("用户服务被调用");
        return "您好:"+id;
    }
}
