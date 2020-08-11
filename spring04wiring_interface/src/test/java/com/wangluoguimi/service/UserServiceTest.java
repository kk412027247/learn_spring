package com.wangluoguimi.service;

import com.wangluoguimi.service.impl.UserServiceNormal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    @Autowired
    @Qualifier("userServiceNormal")
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
