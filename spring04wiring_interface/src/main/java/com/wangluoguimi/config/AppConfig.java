package com.wangluoguimi.config;

import com.wangluoguimi.dao.UserDao;
import com.wangluoguimi.service.UserService;
import com.wangluoguimi.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.wangluoguimi")
//@ComponentScan(basePackages = {"com.wangluoguimi.dao","com.wangluoguimi.service","com.wangluoguimi.web"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class AppConfig {

}
