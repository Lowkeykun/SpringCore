package com.example.model;

import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    // initialize a value for the name
    private String name = "Ford Raptor";
    private final VehicleService vehicleService;

    // Using Autowired annotation to the constructor (it is recommended for the production for security purposes)
    @Autowired
    public Vehicle(VehicleService vehicleService){
        System.out.println("Initialization of vehicle constructor");
        this.vehicleService = vehicleService;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public VehicleService getVehicleService(){
        return vehicleService;
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }

    // Created a toString method so that we can avoid printing hashcode
    @Override
    public String toString(){
        return "Congratulations to your " +name;
    }

}
