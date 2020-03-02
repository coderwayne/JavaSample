package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/user")
public class BookService {
    @RequestMapping("/test")
    public String validityCheck() {
        System.out.println("validityCheck succeed");
        return "success";
    }

    @RequestMapping("/testRequestParams")
    public String testRequestParams(@RequestParam(value="title", required=true) String bookName,
                                    @RequestParam(name = "author", defaultValue = "未知") String bookAuthor) {
        System.out.println("book name is:" + bookName);
        System.out.println("author is:" + bookAuthor);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(HttpServletRequest request, @RequestBody String body) {
        System.out.println("body is:" + body);
        System.out.println(request.getCharacterEncoding());
        return "success";
    }
}
