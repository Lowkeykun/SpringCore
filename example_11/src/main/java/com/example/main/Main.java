package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Person;
import com.example.model.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans and we use AnnotationConfigApplicationContext
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // gets the bean of each class
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        // after getting the bean, we can fetch the corresponding values of each beans
        System.out.println("Hello " + person.getName());
        System.out.printf("Your %s is looking good%n", vehicle.getName());
        System.out.println(person.getVehicle());
        System.out.printf("The owner of %s is %s%n", vehicle.getName(), person.getName());


    }
}
