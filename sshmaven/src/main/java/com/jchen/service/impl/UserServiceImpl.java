package com.jchen.service.impl;

import com.jchen.bean.User;
import com.jchen.dao.UserDao;
import com.jchen.mapper.UserMapper;
import com.jchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean loginUser(String username, String password) {
        if (userDao.getUser(username, password) != null)
            return true;
        return false;
    }

    @Override
    public boolean checkUser(String username, String password) {
        if (userMapper.findUser(username, password) != null)
            return true;
        return false;
    }
}
