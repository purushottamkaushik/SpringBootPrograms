package com.example.springbootemailex.runner;

import com.example.springbootemailex.service.MyEmailDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailRunner implements CommandLineRunner {


    @Autowired
    private MyEmailDemo emailDemoService;

    @Override
    public void run(String... args) throws Exception {

        String []recipients = new String[] {"purushottamkaushik96@gmail.com","heenarao014@gmail.com"};
        Resource resource = new UrlResource("");
        boolean sent = emailDemoService.sendMail("contact.purushottam96@gmail.com", recipients, null, null,
                "HEllo", "DEMO Mail, In test region", resource);
        if (sent) {
            System.out.println("MAIL SENT SUCCESS");
        } else {
            System.out.println("MAIL SENT Failure");
        }
    }
}
