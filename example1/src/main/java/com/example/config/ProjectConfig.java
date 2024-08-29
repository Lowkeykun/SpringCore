package com.example.config;

import com.example.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
     public Vehicle moveVehicle(){
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Audi");
        return myVehicle;
    }

    @Bean
    public String sayHello(){
        return "Hello World!";
    }

    @Bean
    public Integer countNumber(){
        return 24;
    }

}
