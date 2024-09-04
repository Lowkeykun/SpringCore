package com.example.service;

import com.example.model.Song;
import com.example.model.Vehicle;
import com.example.service.interfaces.LogAspect;
import com.example.service.interfaces.Speakers;
import com.example.service.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// Prototype is the counterpart of singleton scope, it gives a new instance of every bean request
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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
    @LogAspect
    public String playMusic(boolean isVehicleStarted, Song song){
        return speakers.makeSound(song);
    }


    // service method, that calls the interface method
    public String moveVehicle(boolean isVehicleStarted){
        return tyres.rotate();
//        throw new NullPointerException("NullPointerException occur!");
    }

    public String applyBreak(boolean isVehicleStarted){
        return tyres.stop();
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
