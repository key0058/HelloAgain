package com.jchen.dao.impl;

import com.jchen.bean.User;
import com.jchen.dao.UserDao;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public boolean checkUser(User user) {

        Session session = getSessionFactory().getCurrentSession();
        String hql = "select u.id, u.username, u.password, u.age from User u where u.username = ?1 and u.password = ?2";
        List<User> results = session.createQuery(hql)
                .setParameter(1, user.getUsername())
                .setParameter(2, user.getPassword()).list();
        if (results != null && results.size() > 0) {
            System.out.println("Find user " + results.get(0).getId());
            return true;
        }
        return false;
    }
}
