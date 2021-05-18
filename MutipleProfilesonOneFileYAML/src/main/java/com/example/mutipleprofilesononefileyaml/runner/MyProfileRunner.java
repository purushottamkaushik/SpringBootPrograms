package com.example.mutipleprofilesononefileyaml.runner;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Data
//@Profile("PROD")
@Profile({"QA","PROD"})
public class MyProfileRunner  implements CommandLineRunner {


    @Value("${my.app.title}")
    private String title;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("FROM PROFILE RUNNER");
        System.out.println(this);
    }




}
