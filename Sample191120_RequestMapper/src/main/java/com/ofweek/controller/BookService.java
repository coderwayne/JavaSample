package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bookService")
public class BookService {
    @RequestMapping("/getOne")
    public String getBook() {
        System.out.println("you get a book");
        return "success";
    }

    @RequestMapping(value="/testMethod", method = {RequestMethod.POST})
    public String testMethod() {
        System.out.println("test method");
        return "success";
    }

    @RequestMapping(value="/testParams", params = {"bookName!=JaneEyre", "author"})
    public String testParams() {
        System.out.println("test params");
        return "success";
    }

    @RequestMapping(value="/testHeaders", headers = {"Accept-Encoding"})
    public String testHeader() {
        System.out.println("test headers");
        return "success";
    }
}
