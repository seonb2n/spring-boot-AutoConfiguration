package com.example.get.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //requestMapping 은 URI 을 지정해주는 Annotation
public class ApiController {


    @GetMapping("/hello") //http://localhost:9090/api/hello
    public String hello() {
        return "hello spring boot";
    }

}
