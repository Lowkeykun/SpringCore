package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans where it uses @ComponentScan so that spring will locate the stereotype annotations
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* Since it is indicated there is only one bean class to use we don't need to use specific
           value of bean. the first print statement should be null because we did not pass any value yet
        */
        Vehicle myVehicle1 = context.getBean(Vehicle.class);
        System.out.println("First vehicle name: " + myVehicle1.getName());

        // it will print the desired output
        myVehicle1.sayHello();
        myVehicle1.moveVehicle();
    }
}
