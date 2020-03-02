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

    @RequestMapping("/CodeForward")
    public void CodeForward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请求转发(代码)");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
    }

    @RequestMapping("/CodeRedirect")
    public void CodeRedirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("重定向(代码)");
        response.sendRedirect(request.getContextPath() + "/hxw.jsp");
    }

    @RequestMapping("/StringForward")
    public String StringForward() {
        System.out.println("请求转发(字符串)");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/StringRedirect")
    public String StringRedirect() {
        System.out.println("重定向(字符串)");
        return "redirect:/hxw.jsp";
    }
}
