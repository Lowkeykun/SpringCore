package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Person;
import com.example.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans and we use AnnotationConfigApplicationContext
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // gets the bean of each class
        Person person = context.getBean(Person.class);

        // after getting the bean, we can fetch the corresponding values of each beans
        System.out.println("Hello " + person.getName());
        System.out.println(person.getVehicle());



    }
}
