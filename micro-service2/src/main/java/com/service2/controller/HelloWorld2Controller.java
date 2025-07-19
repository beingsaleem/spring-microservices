package com.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloWorld2Controller {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World from Service2";
    }
}
