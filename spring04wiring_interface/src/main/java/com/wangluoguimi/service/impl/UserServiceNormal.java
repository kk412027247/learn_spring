package com.wangluoguimi.service.impl;

import com.wangluoguimi.dao.UserDao;
import com.wangluoguimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Component("normal")
@Service
public class UserServiceNormal implements UserService {

    @Autowired
    @Qualifier("userDaoNormal")
    private UserDao userDao;

    @Override
    //@Qualifier("normal")
    public void add() {
        userDao.add();
    }
}
