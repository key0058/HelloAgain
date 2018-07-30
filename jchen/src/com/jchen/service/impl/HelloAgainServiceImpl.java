package com.jchen.service.impl;

import com.jchen.service.HelloService;

public class HelloAgainServiceImpl implements HelloService {

    @Override
    public boolean checkUser(String username, String password) {
        return false;
    }
}
