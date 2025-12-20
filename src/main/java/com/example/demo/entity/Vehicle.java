package com.example.demo.entity;

public class Vehicle {

    private String name;
    private String type;

    public Vehicle() { }

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
