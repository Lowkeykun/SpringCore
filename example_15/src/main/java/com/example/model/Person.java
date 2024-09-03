package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

    // instance variables were we declare a value for it
    private String name = "Jerome";
    private final Vehicle vehicle;


    // Using Autowired annotation to the constructor (it is recommended for the production for security purposes)
    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Initialization of person constructor");
        this.vehicle = vehicle;
    }

    public String getName(){
        return name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setName(String name){
        this.name = name;
    }

    // I removed setter for Vehicle variable because we declared it as a final

}
