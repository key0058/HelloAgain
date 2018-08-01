package com.jchen.mapper;

import com.jchen.bean.User;
import org.hibernate.HibernateException;

public interface UserDao {

    public boolean checkUser(User user);

}
