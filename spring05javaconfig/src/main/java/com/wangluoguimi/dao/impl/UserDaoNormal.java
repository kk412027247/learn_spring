package com.wangluoguimi.dao.impl;

import com.wangluoguimi.dao.UserDao;

public class UserDaoNormal implements UserDao {
    @Override
    public void add() {
        System.out.println("add user to database");
    }
}
