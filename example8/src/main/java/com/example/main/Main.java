package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans where we construct in the xml in the resources folder and we use ClassPathXmlApplicationContext
        var context = new ClassPathXmlApplicationContext("beans.xml");

        // gets the bean
        Vehicle fordVehicle = context.getBean(Vehicle.class);
        System.out.println("Congratulation to your " + fordVehicle.getName());

    }
}
