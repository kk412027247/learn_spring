package com.wangluoguimi.service.impl;

import com.wangluoguimi.dao.UserDao;
import com.wangluoguimi.service.UserService;
import org.springframework.stereotype.Service;

public class UserServiceNormal implements UserService {


    private UserDao userDao;


    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
    }
}

