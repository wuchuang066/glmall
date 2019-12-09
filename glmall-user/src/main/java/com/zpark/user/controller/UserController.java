package com.zpark.user.controller;

import com.zpark.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuc
 * @date 2019/11/14 21:39
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public String queryUser() {
        return "success";
    }

}
