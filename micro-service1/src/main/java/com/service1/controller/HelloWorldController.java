package com.service1.controller;

import com.service1.client.Service2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/")
public class HelloWorldController {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public Service2Client service2Client;

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World from Service1";
    }

    @GetMapping("to/service2")
    public String callService2() {
        //return restTemplate.getForObject("http://localhost:8081/api/service2/v1/hello", String.class);
        return service2Client.helloWorld();
    }
}
