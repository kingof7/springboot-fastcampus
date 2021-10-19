package com.example.mvc.controller;

import com.example.mvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        User user = new User(); // 11버전부터는 var 변수타입 가능
        user.setName("steve");
        user.setAddress("fastcampus");
        return user;
    }

}
