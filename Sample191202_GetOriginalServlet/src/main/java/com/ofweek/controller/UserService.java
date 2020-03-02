package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserService {
    @RequestMapping("/test")
    public String justTest() {
        System.out.println("just test");
        return "success";
    }

    @RequestMapping("/getParams")
    public String getParams(String uname, String pwd) {
        System.out.println("uname:" + uname + "," + pwd);
        return "success";
    }

    @RequestMapping("/getOriginalServlet")
    public String getOriginalServlet(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }

    @RequestMapping("/getMixedParams")
    public String getMixedParams(String userName, HttpServletRequest request, String password, HttpServletResponse response) {
        System.out.println(userName);
        System.out.println(request);
        System.out.println(password);
        System.out.println(response);

        return "success";
    }
}
