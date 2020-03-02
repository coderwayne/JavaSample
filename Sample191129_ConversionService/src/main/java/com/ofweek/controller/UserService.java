package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserService {
    @RequestMapping("/get")
    public String getUser() {
        System.out.println("you got a user");
        return "success";
    }

    @RequestMapping("/updateBirthday")
    public String updateBirthday(String userName, Date date) {
        System.out.println("userName:" + userName + ", birthday:" + date);
        return "success";
    }
}
