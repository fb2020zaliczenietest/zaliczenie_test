package com.fb2020_test.zaliczenie.controllers;

import com.fb2020_test.zaliczenie.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "HELLO";
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("Jacek", 21, "Lublin");
    }
}
