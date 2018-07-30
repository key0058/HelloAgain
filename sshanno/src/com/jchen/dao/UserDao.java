package com.jchen.dao;

import com.jchen.bean.User;

public interface UserDao {

    public User getUser(String username, String password) throws Exception;

}
