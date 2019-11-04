package com.ex0312.geode.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@CacheServerApplication(locators = "localhost[10334]")
@SpringBootApplication
public class GeodeLocatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeodeLocatorApplication.class, args);
    }
}