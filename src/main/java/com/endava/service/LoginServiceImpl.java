package com.endava.service;

import com.endava.DAO.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vcerbu on 4/26/2017.
 */

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }


    @Transactional
    public boolean checkLogin(String username, String password) {
        System.out.println("In Service class, check login");
        return loginDAO.checkLogin(username, password);
    }


}
