package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps !!!!! ";
    }

    @GetMapping("/health")
    public String health() {
        return "Health Ok";
    }
}
