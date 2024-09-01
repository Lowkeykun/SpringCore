package com.example.model;

// I remove the @Component annotation because I am handling the behavior of beans
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
