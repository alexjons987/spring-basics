package com.example.springbasics.controller;

import com.example.springbasics.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private final List<Person> personList = new ArrayList<>();

    @PostMapping("/printperson")
    public String printPerson(@RequestBody Person person) {
        return person.toString();
    }

    @GetMapping("/printperson")
    public String getPersonById(@RequestParam Integer id) {
        return personList.stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .toString();
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
