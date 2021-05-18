package com.example.app9springbootapplicationymlmultiplefiles.service.impl;

import com.example.app9springbootapplicationymlmultiplefiles.service.ExportService;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class CsvExport implements ExportService {

    private String username;
    private String password;



    @Override
    public void export() {
        System.out.println("From Csv Export");
        System.out.println(this);
    }
}
