package com.springboot.service;

import com.springboot.entities.User;

public interface UserService {

    public int addUser();

    public User getUserInfo(String userName);

}
