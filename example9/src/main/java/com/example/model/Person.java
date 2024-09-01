package com.example.model;

public class Person {

    // Uses a default constructor to check its initialization
    public Person(){
        System.out.println("Initialization of person constructor");
    }

    // instance variables that includes Vehicle class as a dependency
    private String name;
    private Vehicle vehicle;

    public String getName(){
        return name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }


}
