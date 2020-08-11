package com.wangluoguimi.service.impl;

import com.wangluoguimi.service.UserService;
import org.springframework.stereotype.Component;


@Component
public class UserServiceNormal implements UserService {
    @Override
    public void add() {
        System.out.println("add user");
    }
}
