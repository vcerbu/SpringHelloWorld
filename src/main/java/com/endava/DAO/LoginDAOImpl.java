package com.endava.DAO;

import org.hibernate.*;

import org.hibernate.mapping.List;
import org.hibernate.query.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.NoResultException;


/**
 * Created by vcerbu on 4/26/2017.
 */

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean checkLogin(String username, String password) {
        System.out.println("In check login");
        Session session = sessionFactory.getCurrentSession();
        boolean userFound = false;
        String SQLQuery = "from User where username=:username and password=:password";
        Query query = session.createQuery(SQLQuery);
        query.setParameter("username", username);
        query.setParameter("password", password);
        java.util.List list = null;
        try {
            list = query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
        }

        if ((list != null) && list.size() > 0) {
            userFound = true;
        }

        return userFound;
    }
}
