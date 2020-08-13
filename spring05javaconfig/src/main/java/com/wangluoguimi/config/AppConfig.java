package com.wangluoguimi.config;


import com.wangluoguimi.dao.UserDao;
import com.wangluoguimi.dao.impl.UserDaoNormal;
import com.wangluoguimi.service.UserService;
import com.wangluoguimi.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserDao getUserDaoNormal(){
        System.out.println("creating user dao");
        return new UserDaoNormal();
    }

    @Bean
    public UserService getUserServiceNormal(){
        System.out.println("create user service");
        UserDao userDao =new UserDaoNormal();
        return new UserServiceNormal(userDao);
    }
}
