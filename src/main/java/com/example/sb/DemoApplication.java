package com.example.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Developer Syed! Welcome to Spring Boot.";
    }
    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "Welcome, " + user.getName() + "! Aapki age hai: " + user.getAge();
    }
}


