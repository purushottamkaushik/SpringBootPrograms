package com.example.app5propertiesfileenvironmentexample.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class DbConnection implements CommandLineRunner {

    String username;
    String password;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DbConnection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
