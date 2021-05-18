package in.nit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.app",
        "in.nit.demo"
})
public class ComponentScanExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ComponentScanExampleApplication.class, args);
        Object ob = ac.getBean("student");
        Object ob1 = ac.getBean("employee");
        System.out.println(ob);
        System.out.println(ob1);
    }

}
