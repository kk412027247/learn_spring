package com.wangluoguimi.web;

import com.wangluoguimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceNormal")
    private UserService userService;

    public void add(){
        userService.add();
    }
}
