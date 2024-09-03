package com.example.service.impl;

import com.example.service.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    // overriding the method in the speaker interface
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
