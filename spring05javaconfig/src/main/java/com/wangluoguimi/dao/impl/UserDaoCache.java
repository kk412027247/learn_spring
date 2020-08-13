package com.wangluoguimi.dao.impl;

import com.wangluoguimi.dao.UserDao;

public class UserDaoCache implements UserDao {
    @Override
    public void add() {
        System.out.println("add user to cache");
    }
}
