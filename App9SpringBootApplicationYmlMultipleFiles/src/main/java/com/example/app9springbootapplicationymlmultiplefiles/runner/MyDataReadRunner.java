package com.example.app9springbootapplicationymlmultiplefiles.runner;

import com.example.app9springbootapplicationymlmultiplefiles.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyDataReadRunner implements CommandLineRunner {

    @Autowired
    ExportService service;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From run method");
        service.export();
    }
}
