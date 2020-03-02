package com.ofweek.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"ofweekMsg"})
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("test Validity");
        return "success";
    }

    @RequestMapping("/setRequestScopeInfo")
    public String setRequestScopeInfo(Model model) {
        model.addAttribute("ofweekMsg", "老胡");
        System.out.println("set RequestScopeInfo");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println(modelMap.getAttribute("ofweekMsg"));
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String  delSessionAttributes(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "success";
    }
}
