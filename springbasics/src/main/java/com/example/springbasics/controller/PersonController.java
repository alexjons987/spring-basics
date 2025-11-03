package com.example.springbasics.controller;

import com.example.springbasics.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @PostMapping("/person")
    public String createPerson(@RequestBody Person person) {
        return person.toString();
    }
}
