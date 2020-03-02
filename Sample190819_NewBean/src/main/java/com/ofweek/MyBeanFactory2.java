package com.ofweek;

public class MyBeanFactory2 {

    public UserService geteUserService() {
        return new UserServiceImpl();
    }
}
