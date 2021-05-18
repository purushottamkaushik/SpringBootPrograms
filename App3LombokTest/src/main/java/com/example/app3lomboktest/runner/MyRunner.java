package com.example.app3lomboktest.runner;

import com.example.app3lomboktest.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Student s = new Student();
        s.setSid("1111");
        s.setSname("Hello");
        System.out.println(s);

        Student s1 = new Student("1111","Hello");

        System.out.println("s1.equals(s)  : " + s.equals(s1));
    }
}
