package com.ofweek;

import org.springframework.stereotype.Repository;

@Repository("userDaoId")
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("you saved a book");
    }
}
