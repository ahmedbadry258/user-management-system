package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String appName(){
        return "User Management System";
    }
    @GetMapping("/users")
    public String getUsers(){
        return "List Of Users";
    }
}
