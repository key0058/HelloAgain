package com.jchen.service;

import com.jchen.bean.User;

public interface UserService {

    public boolean loginUser(String username, String password);
    public boolean checkUser(String username, String password);
}
