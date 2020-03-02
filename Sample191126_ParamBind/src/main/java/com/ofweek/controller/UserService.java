package com.ofweek.controller;

import com.ofweek.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userService")
public class UserService {
    @RequestMapping("/getUser")
    public String getUser() {
        System.out.println("you got a user");
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(String uname, String pwd) {
        System.out.println("name:"+uname+",pwd:"+pwd);
        return "success";
    }

    @RequestMapping("/testParamToBean")
    public String testParamToBean(User user) {
        System.out.println(user);
        return "success";
    }
}
