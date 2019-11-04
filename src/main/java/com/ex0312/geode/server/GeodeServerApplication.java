package com.ex0312.geode.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@CacheServerApplication(locators = "localhost[10334]")
@SpringBootApplication
public class GeodeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeodeServerApplication.class, args);
    }
}