package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    // Uses a default constructor to check its initialization
    public Vehicle(){
        System.out.println("Initialization of vehicle constructor");
    }

    // initialize a value for the name
    private String name = "Ford Raptor";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public void sayHello(){
        System.out.println("Hello World!");
    }

    // Created a toString method so that we can avoid printing hashcodes
    @Override
    public String toString(){
        return "Congratulations to your " +name;
    }

}
