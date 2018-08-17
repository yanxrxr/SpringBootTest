package com.springboot.service;

import com.springboot.entities.User;

public interface UserService {

    int addUser(User newUser);

    User getUserInfo(String userName);

}
