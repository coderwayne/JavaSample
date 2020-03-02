package com.ofweek;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestClass {

    @Test
    public void demo01() {
        System.out.println("demo01");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
