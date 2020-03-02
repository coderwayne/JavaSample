package com.ofweek;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller("userActionId")
public class UserAction {
    @Test
    public void testAddUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceId");
        userService.addUser();
        context.close();
    }

    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) context.getBean("userServiceId");
        UserService userService2 = (UserService) context.getBean("userServiceId");
        System.out.println(userService1);
        System.out.println(userService2);
    }

    public void testInitAndDestroy() {

    }
}
