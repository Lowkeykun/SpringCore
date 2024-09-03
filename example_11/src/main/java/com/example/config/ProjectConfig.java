package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// the bean creation is handled in the package since we use a stereotype annotation
@Configuration
@ComponentScan(basePackages = "com.example.model")
public class ProjectConfig {

}
