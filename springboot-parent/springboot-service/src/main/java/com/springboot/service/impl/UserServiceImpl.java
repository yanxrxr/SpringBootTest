package com.springboot.service.impl;

import com.springboot.dao.UserDao;
import com.springboot.entities.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser() {
        String userName = "Upsky";
        String userEmail = "kobegoup@sina.com";
        String userPassword = "abc1234";
        return userDao.addUser(userName, userEmail, userPassword);
    }

    @Override
    public User getUserInfo(String userName) {
        return userDao.getUserInfo(userName);
    }
}
