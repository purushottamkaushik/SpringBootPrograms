package com.example.mutipleprofilesononefileyaml.runner;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("default")
@Component
@Data
public class MyTestRunner implements CommandLineRunner {

    @Value("${my.app.title}")
    private String title;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("FROM TEST RUNNER");
        System.out.println(this);
    }
}
