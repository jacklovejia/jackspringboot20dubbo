package com.jack.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jack.dubbo.service.api.AccountServiceApi;
import com.jack.dubbo.service.api.UserServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @Reference
    private AccountServiceApi accountServiceApi;
    @Reference
    private UserServiceApi userServiceApi;

    @RequestMapping("/test01")
    public String test(){
        return accountServiceApi.getBalance("1213");
    }


}
