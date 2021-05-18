package com.example.app7springbootprofilesalertsystem.service.impl;

import com.example.app7springbootprofilesalertsystem.service.AlertSystem;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
@Primary
//@Profile("email")
@Data
public class EmailAlert implements AlertSystem {

    private String username;
    private String password;
    @Override
    public void sendMessage() {
        System.out.println("FFROM EMAIL ALERT");
        System.out.println(this);
    }
}
