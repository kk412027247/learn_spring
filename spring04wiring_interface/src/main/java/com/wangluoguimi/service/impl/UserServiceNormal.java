package com.wangluoguimi.service.impl;

import com.wangluoguimi.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Component("normal")
public class UserServiceNormal implements UserService {
    @Override
    //@Qualifier("normal")
    public void add() {
        System.out.println("add user");
    }
}
