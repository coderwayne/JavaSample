package com.ofweek.controller;

import com.ofweek.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("test Validity");
        return "success";
    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("user:" + user);
        user.setPassword("changedpwd");
        user.setAge(98);
        return user;
    }
}
