package com.stackroute.domain;

public class Actor {

    int age;
    String gender;
    String name;

    public Actor(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

}

