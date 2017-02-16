package com.cj.controller;

import com.cj.entity.User;
import com.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenjing on 2017/2/15.
 */
@Controller
@RequestMapping("user")
public class UserControler {

    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public void addUser(User user){
        userService.insertUser(user);
    }

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }

}
