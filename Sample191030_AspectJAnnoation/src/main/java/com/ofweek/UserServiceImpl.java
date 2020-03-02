package com.ofweek;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("you added a user.");
    }

    public String updateAddress(String address) {
        System.out.println("address updated.");
//        int i = 1/0;
        return "success";
    }

    public void deleteUser() {
        System.out.println("you deleted a user");
    }
}
