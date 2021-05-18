package com.app2.app2hasavariablepropertiesloading.runner;

import com.app2.app2hasavariablepropertiesloading.model.DbConnection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "my.app")
public class MyRunner implements CommandLineRunner {

    DbConnection con;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }

    public DbConnection getCon() {
        return con;
    }

    public void setCon(DbConnection con) {
        this.con = con;
    }

    @Override
    public String toString() {
        return "MyRunner{" +
                "con=" + con +
                '}';
    }


}

