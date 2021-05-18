package com.example.app10stopwatchexample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class StopWatchRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        StopWatch watch = new StopWatch("watch1");
        watch.start("LOOP#1");
        for (int i = 0; i < 1000000000; i++) {

        }
        watch.stop();
        watch.start("LOOP#2");


        for (int i = 0; i < 2000000000; i++) {

        }
        watch.stop();
        watch.start("LOOP#3");


        for (int i = 0; i < 1500000000; i++) {

        }
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
}
