package com.ofweek.dao;

import com.ofweek.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();
}
