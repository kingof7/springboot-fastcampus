package com.example.mvc.controller;

import com.example.mvc.dto.User;
import com.example.mvc.dto.UserReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 이걸붙여줌으로서 리퀘스트바디 애노테이션 안써도되고, ResponseEntity로 반환 가능
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/")
    public UserReq user(UserReq userReq){
        return userReq;
    }

    @GetMapping("/hello") // 주소할당
    public String hello(){
        return "hello spring boot";
    }

    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // JSON
    // 실제적으로 req -> object mapper -> method -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


}
