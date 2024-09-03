package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// the bean creation is handled in the package since we use a stereotype annotation (@Component)
@Configuration
// We use component scan to auto-detect and register beans, it becomes handy specially if you have a lot of beans
@ComponentScan(basePackages = {"com.example.service.impl", "com.example.service",
                               "com.example.aspects", "com.example.model"}) // scan through packages
@EnableAspectJAutoProxy // This annotation is required to allow AOP proxying in Spring application
public class ProjectConfig {

}
