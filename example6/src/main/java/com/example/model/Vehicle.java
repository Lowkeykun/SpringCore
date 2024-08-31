package com.example.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void initialize(){
        this.name = "Ford Raptor";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Selling " +name);
    }
}
