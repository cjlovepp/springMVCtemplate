package com.cj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenjing on 2017/2/22.
 */
@Controller
public class MainController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
