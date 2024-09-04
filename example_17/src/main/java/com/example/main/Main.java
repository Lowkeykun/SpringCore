package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Person;
import com.example.model.Song;
import com.example.model.Vehicle;
import com.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Configuration of beans and we use AnnotationConfigApplicationContext
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* We did not call the bean to the Person.class because it is a singleton, where person class has a dependency
           to VehicleService which is prototype scope since the parent is singleton the service layer will not act
           as a prototype
        */

        // gets the bean of the service class, with different variable name
        VehicleService myVehicleService = context.getBean(VehicleService.class);

        System.out.println(myVehicleService.getClass());

        // Declaring values to the variables
        Song mySong = new Song();
        mySong.setTitle("Sining");
        mySong.setArtist("Dionela");
        boolean isStarted = true;

        // passing the values through the parameters
        String moveVehicleStatus = myVehicleService.moveVehicle(isStarted);
        String playMusicStatus = myVehicleService.playMusic(isStarted, mySong);
        String breakStatus = myVehicleService.applyBreak(isStarted);

        System.out.println(moveVehicleStatus);
        System.out.println(playMusicStatus);
        System.out.println(breakStatus);







    }
}
