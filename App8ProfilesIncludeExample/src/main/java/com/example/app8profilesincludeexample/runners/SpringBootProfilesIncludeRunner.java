package com.example.app8profilesincludeexample.runners;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class SpringBootProfilesIncludeRunner implements CommandLineRunner {

    private String appname;
    private String version;
    private String username;
    private String password;
    private String email;
    private String epassword;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }
}
