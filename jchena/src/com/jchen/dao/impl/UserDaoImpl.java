package com.jchen.dao.impl;

import com.jchen.bean.User;
import com.jchen.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public User getUser(String username, String password) throws Exception {
        String hql = "from User u where u.username = ?1 and u.password = ?2";
        List<User> result = sessionFactory.getCurrentSession().createQuery(hql)
                .setParameter(1, username)
                .setParameter(2, password)
                .list();

        if (result.size() > 0)
            return result.get(0);
        return null;
    }
}
