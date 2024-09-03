package com.example.config;

import com.example.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// the bean creation is handled in the package since we use a stereotype annotation
@Configuration
@ComponentScan(basePackages = "com.example.model")
public class ProjectConfig {

    @Bean
    Vehicle myVehicle1(){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Ford Raptor");
        return vehicle1;
    }

    @Bean
    Vehicle myVehicle2(){
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("Honda Type - R");
        return vehicle2;
    }

    @Bean
    @Primary
    Vehicle myVehicle3(){
        Vehicle myVehicle3 = new Vehicle();
        myVehicle3.setName("Tesla Model X");
        return myVehicle3;
    }
}
