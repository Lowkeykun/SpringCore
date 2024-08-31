package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans where it uses @ComponentScan so that spring will locate the stereotype annotations
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* When we use the generic stereotype annotation which is @Component, we the developers cant control the bean
           unlike using @Bean in that case we use @PostConstruct annotation to instruct the spring to initialize the method
           after it finishes the bean creation
        */
        Vehicle myVehicle1 = context.getBean(Vehicle.class);
        System.out.println("First vehicle name: " + myVehicle1.getName());

        // it will print the desired output
        myVehicle1.sayHello();

    }
}
