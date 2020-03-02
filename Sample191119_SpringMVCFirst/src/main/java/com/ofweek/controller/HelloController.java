package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(path="/hxw")
    public String sayHello() {
        System.out.println("Hello,Spring MVC");
        return "success";
    }
}
