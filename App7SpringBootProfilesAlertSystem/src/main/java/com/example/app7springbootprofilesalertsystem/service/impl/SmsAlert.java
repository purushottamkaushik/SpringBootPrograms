package com.example.app7springbootprofilesalertsystem.service.impl;

import com.example.app7springbootprofilesalertsystem.service.AlertSystem;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Data
@Profile("default")
@ConfigurationProperties(prefix = "my.app.default")
public class SmsAlert implements AlertSystem {

    private String username;
    private String password;

    @Override
    public void sendMessage() {
        System.out.println("Alert from SMS");
    }
}
