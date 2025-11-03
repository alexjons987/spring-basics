package com.example.springbasics.controller;

import com.example.springbasics.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    HelloService helloService;

    public HelloController() {
        helloService = new HelloService();
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.greet(name);
    }
}
