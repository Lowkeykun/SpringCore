package com.example.model;

// This i a POJO class that is being used as object
public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }

}
