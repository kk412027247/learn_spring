package com.wangluoguimi.service.impl;

import com.wangluoguimi.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("festival")
//@Primary
public class UserServiceFestival implements UserService {
    @Override
    public void add() {
        System.out.println("send coupon to user");
    }
}
