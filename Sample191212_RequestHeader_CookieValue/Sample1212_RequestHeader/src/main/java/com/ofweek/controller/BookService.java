package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Soundbank;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("testValidity");
        return "success";
    }

    @RequestMapping("/getRequestHeader")
    public String getRequestHeader(@RequestHeader(name = "Accept") String header) {
        System.out.println("请求头是：" + header);
        return "success";
    }

    @RequestMapping("/getCookieValue")
    public String getCookieValue(@CookieValue("JSESSIONID") String cookieValue) {
        System.out.println("CookieValue is " + cookieValue);
        return "success";
    }
}
