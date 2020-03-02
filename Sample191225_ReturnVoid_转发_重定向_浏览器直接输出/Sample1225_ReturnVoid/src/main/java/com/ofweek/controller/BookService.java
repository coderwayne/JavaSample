package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("test Validity");
        return "success";
    }

    /**
     *
    转发是1次请求，视图解析器不适用
    转发的语句执行后，后面的代码会继续执行，如果不想后面的代码继续执行，就加上return
     */
    @RequestMapping("/testZhuanFa")
    public void testZhuanFa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请求转发");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
    }

    /**
     *
    重定向等于重新发了一个新的请求，发请求是不能直接访问/WEB-INF里面的东西
     */
    @RequestMapping("/testChongDingXiang")
    public void testChongDingXiang(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("重定向");
        response.sendRedirect(request.getContextPath() + "/hxw.jsp");
    }

    @RequestMapping("/testGetWriterToPring")
    public void testGetWriterToPring(HttpServletResponse response) throws IOException {
        System.out.println("浏览器直接打印");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        response.getWriter().println("胡大哥");
    }

}
