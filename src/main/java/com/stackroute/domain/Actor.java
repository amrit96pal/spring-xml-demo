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

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
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

