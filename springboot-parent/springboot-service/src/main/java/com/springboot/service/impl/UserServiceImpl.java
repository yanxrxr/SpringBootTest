package com.springboot.service.impl;

import com.springboot.dao.UserDao;
import com.springboot.entities.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User newUser) {
        return userDao.addUser(newUser);
    }

    @Override
    public User getUserInfo(String userName) {
        return userDao.getUserInfo(userName);
    }
}
