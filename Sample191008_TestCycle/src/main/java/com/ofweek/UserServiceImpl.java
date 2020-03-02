package com.ofweek;

public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("you added a user!");
    }

    public void initFun() {
        System.out.println("UserServiceImpl init action");
    }

    public void destroyFun() {
        System.out.println("UserServiceImpl destroy action");
    }
}
