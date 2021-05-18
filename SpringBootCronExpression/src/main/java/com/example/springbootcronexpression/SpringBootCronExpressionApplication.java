package com.example.springbootcronexpression;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootCronExpressionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCronExpressionApplication.class, args);
    }

}
