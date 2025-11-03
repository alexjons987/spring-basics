package com.example.springbasics.model;

public class Person {
    private final String name;
    private final int age;
    private final String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public String toString() {
        return String.format("%s (%d) - %s", this.name, this.age, this.occupation);
    }
}
