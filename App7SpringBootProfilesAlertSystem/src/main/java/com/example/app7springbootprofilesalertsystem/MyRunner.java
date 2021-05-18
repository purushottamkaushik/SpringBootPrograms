package com.example.app7springbootprofilesalertsystem;

import com.example.app7springbootprofilesalertsystem.service.AlertSystem;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyRunner implements CommandLineRunner {

    @Autowired
//    @Qualifier("smsAlert")
    private AlertSystem system;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From runner");
        System.out.println(this);
        system.sendMessage();
    }
}
