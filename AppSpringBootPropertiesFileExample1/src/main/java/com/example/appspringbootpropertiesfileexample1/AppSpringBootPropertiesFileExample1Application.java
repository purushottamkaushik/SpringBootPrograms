package com.example.appspringbootpropertiesfileexample1;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
        "classpath:application.properties",
        "classpath:mydata.properties"
})
public class AppSpringBootPropertiesFileExample1Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(AppSpringBootPropertiesFileExample1Application.class, args);
        Object ob = ac.getBean("product");
        System.out.println(ob);
    }

}
