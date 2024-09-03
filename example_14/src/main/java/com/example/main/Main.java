package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Person;
import com.example.model.Vehicle;
import com.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans and we use AnnotationConfigApplicationContext
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // gets the bean of the service class, with different variable name
        VehicleService myVehicleService = context.getBean(VehicleService.class);
        VehicleService myVehicleService2 = context.getBean(VehicleService.class);

        // printing the hashcode of both bean
        System.out.println("myVehicleService: " + myVehicleService.hashCode());
        System.out.println("myVehicleService2: " + myVehicleService2.hashCode());

        // checking if both beans are equal
        if (myVehicleService == myVehicleService2){
            System.out.println("Confirm! both are the same object");
        }





    }
}
