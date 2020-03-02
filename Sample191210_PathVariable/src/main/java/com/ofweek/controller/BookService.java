package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/test")
    public String testValidity() {
        System.out.println("testValidity success");
        return "success";
    }

    @RequestMapping("/testPathVariable/{actionID}")
    public String testPathVariable(@PathVariable(value="actionID") String curID) {
        System.out.println("当前操作是：" + curID);
        return "success";
    }
}
