package com.example.app4springbootyamlprops.runner;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.List;


@Component
@ConfigurationProperties(prefix = "my.app")
@Data
@ToString
public class MyRunner implements CommandLineRunner {

    private String id;
    private String code;
    private Double cost;
//    List<String> details;
//    Set<String> details;
    String[] details;
    Map<String , String> demoMap;
    Properties demoProps;





    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }

}
