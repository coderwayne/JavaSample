package com.ofweek.controller;

import com.ofweek.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("test Validity");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();

        Book book = new Book();
        book.setBookID(100);
        book.setBookTitle("流浪地球");

        modelAndView.addObject(book);
        modelAndView.setViewName("success");

        return modelAndView;
    }
}
