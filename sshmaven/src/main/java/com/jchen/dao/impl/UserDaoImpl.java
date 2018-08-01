package com.jchen.dao.impl;

import com.jchen.bean.User;
import com.jchen.dao.UserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public User getUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return sqlSessionTemplate.selectOne("getUserByUsernameAndPassword", user);
    }
}
