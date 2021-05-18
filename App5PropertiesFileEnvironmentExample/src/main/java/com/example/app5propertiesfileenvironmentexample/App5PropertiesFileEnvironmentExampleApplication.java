package com.example.app5propertiesfileenvironmentexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App5PropertiesFileEnvironmentExampleApplication {

    // --spring.profile.active=qa
    public static void main(String[] args) {
        SpringApplication.run(App5PropertiesFileEnvironmentExampleApplication.class, args);
    }
}
