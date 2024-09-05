package com.jerome.example_18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// this excluded the dependency, you can enable debug in application.properties
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SchoolWebApp {

	public static void main(String[] args) {
		SpringApplication.run(SchoolWebApp.class, args);
	}

}
