package com.cj.dao;

import com.cj.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenjing on 2017/2/14.
 */
@Repository
public interface UserMapper {
    int addUser(User user);

    User findbyId(String userId);

    List<User> findAll();
}
