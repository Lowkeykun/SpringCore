package com.example.service;

import com.example.model.Vehicle;
import com.example.service.interfaces.Speakers;
import com.example.service.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// Singleton is the default scope in spring, it gives you 1 instance of each bean
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {

    // declaring the interfaces classes as instance variable for service layer
    private Speakers speakers;
    private Tyres tyres;

    // Using Autowired annotation to the constructor (it is recommended for the production for security purposes)
    @Autowired
    public VehicleService(Speakers speakers, Tyres tyres){
        this.speakers = speakers;
        this.tyres = tyres;
    }
    // service method, that calls the interface method
    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }
    // service method, that calls the interface method
    public void moveVehicle(){
        String move = tyres.rotate();
        System.out.println(move);
    }

    public Speakers getSpeakers(){
        return speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }

    public void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }

    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }



}
