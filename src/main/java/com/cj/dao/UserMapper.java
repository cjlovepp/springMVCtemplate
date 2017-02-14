package com.cj.dao;

import com.cj.entity.User;

import java.util.List;

/**
 * Created by chenjing on 2017/2/14.
 */
public interface UserMapper {
    int addUser(User user);

    User findbyId(String userId);

    List<User> findAll();
}
