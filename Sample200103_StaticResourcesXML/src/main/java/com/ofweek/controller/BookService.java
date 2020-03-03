package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("test Validity");
        return "success";
    }
}
