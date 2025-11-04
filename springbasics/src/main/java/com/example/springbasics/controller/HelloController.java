package com.example.springbasics.controller;

import com.example.springbasics.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.welcome-message}")
    String message;

    HelloService helloService;

    public HelloController() {
        helloService = new HelloService();
    }

    @GetMapping("/hello")
    public String greet() {
        return message;
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.greet(name);
    }
}
