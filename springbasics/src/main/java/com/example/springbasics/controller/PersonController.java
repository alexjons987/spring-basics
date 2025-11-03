package com.example.springbasics.controller;

import com.example.springbasics.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private List<Person> personList = new ArrayList<>();

    @PostMapping("/printperson")
    public String createPerson(@RequestBody Person person) {
        return person.toString();
    }

    @PostMapping("/addperson")
    public String addPerson(@RequestBody Person person) {
        try {
            personList.add(person);
        } catch (Exception ignored) {
            return "Failed to add person!";
        }
        return "Added person to list!";
    }

    @GetMapping("/people")
    public List<Person> getAllPersons() {
        return personList;
    }
}
