package com.bezkoder.spring.jpa.h2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot H2 CRUD Application is running!";
    }
}