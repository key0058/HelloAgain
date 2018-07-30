package com.jchen.service.impl;

import com.jchen.dao.UserDao;
import com.jchen.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public boolean loginUser(String username, String password) throws Exception {
        if (userDao.getUser(username, password) != null)
            return true;
        return false;
    }
}
