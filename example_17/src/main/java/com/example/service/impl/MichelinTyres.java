package com.example.service.impl;

import com.example.service.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// uses the primary annotation to make it as a default bean
@Primary
@Component
public class MichelinTyres implements Tyres {

    // overriding the method in the Tyres interface
    @Override
    public String rotate() {
        return "Vehicle Moving using Michelin Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle Stopping using Michelin Tyres";
    }


}
