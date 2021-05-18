package com.example.springbootschedulingfixrate.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyScheduler {

//    @Scheduled(initialDelay = 2000 ,fixedDelay = 3000)
    @Scheduled(initialDelay = 5000,fixedRate = 3000)
    public void myGen1(){
        System.out.println("Hello ==>" + new Date());
    }
}
