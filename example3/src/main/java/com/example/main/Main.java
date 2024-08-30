package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* In order to handle NoUniqueBeanDefinitionException, be specific which bean to call
           especially if there is a lot of multiple classes
        */
        Vehicle myVehicle1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("First vehicle name: " + myVehicle1.getName());

        Vehicle myVehicle2 = context.getBean("fordVehicle", Vehicle.class);
        System.out.println("Second vehicle name: " + myVehicle2.getName());

        Vehicle myVehicle3 = context.getBean("toyotaVehicle", Vehicle.class);
        System.out.println("Third vehicle name: " + myVehicle3.getName());


    }
}
