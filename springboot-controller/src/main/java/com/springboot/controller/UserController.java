package com.springboot.controller;

import com.springboot.entities.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public int addUser(String userName, String userEmail, String userPassword) {
        User newUser = new User();
        newUser.setUserEmail(userEmail);
        newUser.setUserName(userName);
        newUser.setUserPassword(userPassword);
        return userService.addUser(newUser);
    }

    @RequestMapping("getUserInfo")
    public User getUserInfo(String userName) {
        return userService.getUserInfo(userName);
    }

}
