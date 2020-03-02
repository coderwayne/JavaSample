package com.ofweek;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("这是一个构造函数");
    }

    public UserServiceDao userServiceDao;


    public void setUserServiceDao(UserServiceDao userServiceDao) {
        this.userServiceDao = userServiceDao;
    }

    public void addUser() {
        userServiceDao.saveUser();
    }
}
