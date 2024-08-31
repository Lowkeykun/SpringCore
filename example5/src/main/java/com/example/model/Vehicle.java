package com.example.model;

import org.springframework.stereotype.Component;

@Component
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

    public void moveVehicle(){
         Vehicle myVehicle = new Vehicle();
         myVehicle.setName("Ford Raptor");
         System.out.println(myVehicle.getName());
    }
}
