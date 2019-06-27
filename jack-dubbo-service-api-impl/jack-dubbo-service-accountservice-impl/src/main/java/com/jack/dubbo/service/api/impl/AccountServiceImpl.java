package com.jack.dubbo.service.api.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jack.dubbo.service.api.AccountServiceApi;
import com.jack.dubbo.service.api.UserServiceApi;

@Service
public class AccountServiceImpl implements AccountServiceApi {
    @Reference
    private UserServiceApi userServiceApi;
    @Override
    public String getBalance(String uid) {
        System.out.println(userServiceApi.getUserName("12"));
        return "账户余额:"+1314+"RMB";
    }
}
