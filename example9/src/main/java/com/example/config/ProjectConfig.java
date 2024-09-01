package com.example.config;

import com.example.model.Person;
import com.example.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "com.example.model")
public class ProjectConfig {

    // The beans are created sequentially where vehicle will create then person


    // Created beans for vehicle class
    @Bean
    public Vehicle vehicle() {
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Ford Raptor");
        return myVehicle;
    }

    // created beans for person class which has a dependency of vehicle
    @Bean
    public Person person(){
        Person myPerson = new Person();
        myPerson.setName("Jerome");
        myPerson.setVehicle(vehicle());
        return myPerson;
    }




}
