package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Non Spring
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Honda Type-R");
        System.out.println("Vehicle name non spring context: " + myVehicle.getName());

        // Spring
        // Configuration of beans
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // getting the bean from the class
        Vehicle moveVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name spring context: " + moveVehicle.getName());

        String sayHello = context.getBean(String.class);
        System.out.println("String value spring context: " + sayHello);

        Integer countNumber = context.getBean(Integer.class);
        System.out.println("Integer value spring context: " + countNumber);

    }
}
