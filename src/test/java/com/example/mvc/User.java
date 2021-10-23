package com.example.mvc;

public class User {
    private String name;
    private int age;
    

    public User() {
        this.name = null;
        this.age = 0;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User defaultUser() { // 메소드 네임에 get을 쓰면안됨
        return new User("default", 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }

}
