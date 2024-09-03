package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans where it uses @ComponentScan so that spring will locate the stereotype annotations
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // We use Supplier Interface where it does not accept any input but return you something.

        // shortest way to implement supplier interface
       Vehicle ford = new Vehicle();
       ford.setName("Ford Raptor!");
       Supplier<Vehicle> fordSupplier = () -> ford;

       // another way to implement supplier interface
       Supplier<Vehicle> hondaSupplier = () -> {
           Vehicle honda = new Vehicle();
           honda.setName("Honda Type - R");
           return honda;
        };

       // Generate me a random number (1 - 10)
       Random randomNumber = new Random();
       int randomInt = randomNumber.nextInt(10);
        System.out.println("Random number: " + randomInt);

       /* Instruct spring to generate me a bean base on my condition if the generated random number
          even numbers = Type-R; odd numbers = Ford Raptor
        */
       if (randomInt % 2 != 0){
           context.registerBean("ford", Vehicle.class, fordSupplier);
       } else {
           context.registerBean("honda", Vehicle.class, hondaSupplier);
       }

       // Initializing temporary (null) values for the objects to handle the values
       Vehicle fordVehicle = null;
       Vehicle hondaVehicle = null;

       /* Implementing try catch function to handle NoSuchBeanDefinitionException exception and gets the bean
          based on what we registered
        */
       try{
           fordVehicle = context.getBean("ford", Vehicle.class);
       } catch (NoSuchBeanDefinitionException e){
           System.out.println("Ford Vehicle bean is empty!");
       }

       /* Implementing try catch function to handle NoSuchBeanDefinitionException exception and gets the bean
          based on what we registered
        */
       try{
           hondaVehicle = context.getBean("honda", Vehicle.class);
       } catch (NoSuchBeanDefinitionException e){
           System.out.println("Honda Vehicle bean is empty!");
       }

       // Checks if the value of the class is null, if not it will get the value of the name of the class
       if (fordVehicle != null){
           System.out.println("Congratulations to your new " + fordVehicle.getName());
       } else if (hondaVehicle != null) {
           System.out.println("Congratulations to your new " + hondaVehicle.getName());
       } else {
           System.out.println("Something went wrong!");
       }

    }
}
