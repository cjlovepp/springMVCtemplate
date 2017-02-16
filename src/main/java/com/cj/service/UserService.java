package com.cj.service;

import com.cj.dao.UserMapper;
import com.cj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenjing on 2017/2/15.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user){
        userMapper.addUser(user);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

}
