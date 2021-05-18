package com.example.springbootcronexpression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MySchedulingGenerator {

    @Scheduled(cron = "*/5 * * * * *") // Every five second
    public void myGen1() {
        System.out.println("Hello  --> " + new Date() );

    }
    @Scheduled(cron ="5 * * * * *" )
    public void myGen2() {
        System.out.println("Hiii  --> " + new Date() );

    }


}
