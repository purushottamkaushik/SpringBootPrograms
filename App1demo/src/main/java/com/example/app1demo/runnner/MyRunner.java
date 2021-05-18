package com.example.app1demo.runnner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@ConfigurationProperties(prefix = "my.app")

public class MyRunner implements CommandLineRunner {

    Properties pdata;


    public Properties getPdata() {
        return pdata;
    }

    public void setPdata(Properties pdata) {
        this.pdata = pdata;
    }


    @Override
    public String toString() {
        return "MyRunner{" +
                "pdata=" + pdata +
                '}';
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }
}
