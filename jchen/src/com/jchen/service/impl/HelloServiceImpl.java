package com.jchen.service.impl;

import com.jchen.bean.User;
import com.jchen.dao.UserDao;
import com.jchen.service.HelloService;

public class HelloServiceImpl implements HelloService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (userDao.checkUser(user))
            return true;
        return false;
    }
}
