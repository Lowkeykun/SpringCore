package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* Using @Primary annotation will serve as a default bean for spring context due to multiple
           bean with the same classes
        */
        Vehicle myVehicle1 = context.getBean(Vehicle.class);
        System.out.println("First vehicle name: " + myVehicle1.getName());


    }
}
