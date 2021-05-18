package com.example.appspringbootpropertiesfileexample1.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Product {

    @Value("${my.id}")
    private Integer pid;
    @Value("${my.version}")
    private String version;


}
