package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    // instance variables were we declare a value for it
    private String name = "Jerome";

    // Autowired field injection is used, to instruct spring that person has a dependency of vehicle class
//    @Autowired
    private Vehicle vehicle;


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

    // Autowired annotation is used in the setter, to instruct spring that person has a dependency of vehicle class
//    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }


}
