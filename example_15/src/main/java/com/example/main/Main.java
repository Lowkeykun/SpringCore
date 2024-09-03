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

        System.out.println("Before retrieving the bean in Spring context");
        /* Using @Lazy, where instantiation take place when the bean is call unlike @Eager (default) where it creates the
           bean during application startup
        */
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the bean in Spring context");

    }
}
