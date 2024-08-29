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
        Vehicle moveVehicle = context.getBean("moveVehicle1",Vehicle.class);
        System.out.println("Vehicle name spring context: " + moveVehicle.getName());


    }
}
