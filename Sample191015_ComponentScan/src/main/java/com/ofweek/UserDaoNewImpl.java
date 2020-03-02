package com.ofweek;

import org.springframework.stereotype.Repository;

@Repository("UserDaoNewId")
public class UserDaoNewImpl implements UserDao {
    public void saveUser() {
        System.out.println("you saved a book(new)");
    }
}
