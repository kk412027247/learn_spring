package com.wangluoguimi.dao.impl;

import com.wangluoguimi.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class UserDaoNormal implements UserDao {
    @Override
    public void add() {
        System.out.println("add user to database");
    }
}
