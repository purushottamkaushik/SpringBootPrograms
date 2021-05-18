package com.example.stopwatchdemo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class StopWatchRunner  implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("From Run");
        StopWatch watch = new StopWatch();
        watch.start("LOOP 1");
        int j =0;
        for (int i =0 ;i<100000000;i++) {
            j = i;
        }
        watch.stop();

        watch.start("LOOP 2");
        int j1 =0;
        for (int i =0 ;i<100000000;i++) {
            j1 = i;
        }
        watch.stop();

        watch.start("LOOP 3");

        for (int i =0 ;i<10000;i++) {
            Math.pow(i,3);
        }
        watch.stop();
        System.out.println(watch.prettyPrint());
        System.out.println("TOTAAL SEC " + watch.getTotalTimeSeconds());
        System.out.println("TOTAAL MILLI SEC " + watch.getLastTaskTimeMillis());
        System.out.println("TOTAAL NANO SEC " + watch.getLastTaskTimeNanos());
    }
}
