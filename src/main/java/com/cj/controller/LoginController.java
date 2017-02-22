package com.cj.controller;

import com.cj.entity.User;
import com.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by chenjing on 2016/12/10.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public User login(String userName, String password, HttpServletRequest request){
        User user = userService.findByuserNameAndPass(userName, password);
        if (user != null){
            //记录Session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        }else{

        }
        return user;
    }

    @RequestMapping("logout")
    @ResponseBody
    public void logout(){

    }
}
