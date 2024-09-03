package com.example.service.impl;

import com.example.service.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MaxxisTyres implements Tyres {

    // overriding the method in the Tyres interface
    @Override
    public String rotate() {
        return "Vehicle moving using Maxxis Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stop moving using Maxxis Tyres";
    }
}
