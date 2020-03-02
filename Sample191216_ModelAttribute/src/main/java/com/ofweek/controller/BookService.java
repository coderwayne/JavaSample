package com.ofweek.controller;

import com.ofweek.domain.Book;
import com.ofweek.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/center")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity(Book book) {
        System.out.println("test validity " + book);
        return "success";
    }

    @RequestMapping("/testUser")
    public String testUser(User user) {
        System.out.println("test user：" + user);
        return "success";
    }

    @RequestMapping("/testBook")
    public String testBook(Book book) {
        System.out.println("test book：" + book);
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(@ModelAttribute("bookDefault") Book book) {
        System.out.println("test map:" + book);
        return "success";
    }

    @ModelAttribute
    public void mapModelAttribute(Map<String, Book> bookMap, String bookName) {
        Book book = new Book();
        book.setBookID(100);
        book.setBookName(bookName);
        book.setAuthor("日本作者");

        bookMap.put("bookDefault", book);
    }

    @ModelAttribute
    public User userModelAttribute(String userName) {
        System.out.println("user ModelAttribute，拿到了参数：" + userName);
        User user = new User();
        user.setUserID(999);
        user.setUserName("默认用户名");
        return user;
    }

    @ModelAttribute
    public Book bookModelAttribute() {
        System.out.println("book ModelAttribute");
        Book book = new Book();
        book.setBookID(0);
        book.setBookName("未知书名");
        book.setAuthor("未知作者");
        return book;
    }

}