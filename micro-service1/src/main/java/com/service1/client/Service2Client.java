package com.service1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "micro-service2", url = "http://localhost:8081/")
@FeignClient(name = "micro-service2")
public interface Service2Client {

    @GetMapping("api/v1/hello")
    String helloWorld();
}
