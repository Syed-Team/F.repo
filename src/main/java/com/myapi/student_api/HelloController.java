package com.myapi.student_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Assalamualaikum! Spring Boot API ready hai.";
    }
}


