package com.example.app6springbootprofilefallback;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "app")
public class MyDataRunnner implements CommandLineRunner {
//    @Value("${app.username}")
    private String username;
//    @Value("${app.password}")
    private String password;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }
}
