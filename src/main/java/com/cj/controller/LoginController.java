package com.cj.controller;

import com.cj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenjing on 2016/12/10.
 */
@Controller
public class LoginController {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public User login(User user){
        return user;
    }
}
