package com.example.service.impl;

import com.example.service.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// uses the primary annotation to make it as a default bean
@Primary
@Component
public class SonySpeakers implements Speakers {

    // overriding the method in the speaker interface
    @Override
    public String makeSound() {
        return "Playing music using Sony speakers";
    }
}
