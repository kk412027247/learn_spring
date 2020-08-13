package com.wangluoguimi.config;


import com.wangluoguimi.dao.UserDao;
import com.wangluoguimi.dao.impl.UserDaoNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserDao getUserDaoNormal(){
        System.out.println("creating user dao");
        return new UserDaoNormal();
    }
}
