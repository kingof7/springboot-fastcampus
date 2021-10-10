package com.example.mvc.controller;

import com.example.mvc.dto.UserRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

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
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02") //400에러는 클라이언트가 잘못(잘못보냄)
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}