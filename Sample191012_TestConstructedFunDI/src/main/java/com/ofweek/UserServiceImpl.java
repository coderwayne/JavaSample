package com.ofweek;

public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("无参");
    }

    public UserServiceImpl(String userName, int age) {
        System.out.println("userName:"+userName+", age:"+age);
    }

    public UserServiceImpl(Contacts contacts) {
        System.out.println(contacts);
    }

    public void addUser() {

    }
}
