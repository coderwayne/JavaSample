package com.ofweek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("userServiceId")
//@Scope("prototype")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    @Qualifier("UserDaoNewId")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser() {
        userDao.saveUser();
    }

    @PostConstruct
    public void myInit() {
        System.out.println("初始化");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("销毁");
    }
}
