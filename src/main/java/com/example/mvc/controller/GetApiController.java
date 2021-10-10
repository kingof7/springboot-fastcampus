package com.example.mvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // 요즘방식
    public String getHello(){
        return "get Hello";
    }
    
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get, post, put, delete.. 동작가능 = 옛날방식
    public String hi(){
        return "hi";
    }

    @GetMapping("/path-variable/{id}") // 주소에는 대문자 안씀
    public String pathVariable(@PathVariable(name = "id") String pathName){ // 19번라인의 {name}과 20번라인의 "name"을 맞춰줘야함
        System.out.println("pathVariable : " + pathName);
        //System.out.println("PathVariable : " + name);
        return pathName;
    }

    //http://localhost:8081/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    

}