package com.example.config;

import com.example.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
     public Vehicle moveVehicle1(){
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Audi");
        return myVehicle;
    }

    @Bean(value = "fordVehicle")
    public Vehicle moveVehicle2(){
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Ford");
        return myVehicle;
    }

    @Bean("toyotaVehicle")
    public Vehicle moveVehicle3(){
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Toyota");
        return myVehicle;
    }



}
