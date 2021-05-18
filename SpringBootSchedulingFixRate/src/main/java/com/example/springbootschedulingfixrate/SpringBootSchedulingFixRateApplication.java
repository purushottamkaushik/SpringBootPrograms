package com.example.springbootschedulingfixrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // To enable in the project
public class SpringBootSchedulingFixRateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedulingFixRateApplication.class, args);
    }

}
