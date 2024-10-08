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

        /* We did not call the bean to the Person.class because it is a singleton, where person class has a dependency
           to VehicleService which is prototype scope since the parent is singleton the service layer will not act
           as a prototype
        */

        // gets the bean of the service class, with different variable name
        VehicleService myVehicleService = context.getBean(VehicleService.class);
        VehicleService myVehicleService2 = context.getBean(VehicleService.class);

        // printing the hashcode of both bean
        System.out.println("myVehicleService: " + myVehicleService.hashCode());
        System.out.println("myVehicleService2: " + myVehicleService2.hashCode());

        // checking if both beans are equal
        if (myVehicleService == myVehicleService2){
            System.out.println("It is a Singleton Scope");
        } else {
            System.out.println("It is a Prototype Scope");
        }





    }
}
