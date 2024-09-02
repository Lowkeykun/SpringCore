package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// the bean creation is handled in the package since we use a stereotype annotation (@Component)
@Configuration
// We use component scan to auto-detect and register beans, it becomes handy specially if you have a lot of beans
@ComponentScan(basePackages = {"com.example.service.impl", "com.example.service"}) // scan through packages
@ComponentScan(basePackageClasses = {com.example.model.Vehicle.class, com.example.model.Person.class}) // scan classes
public class ProjectConfig {

}
