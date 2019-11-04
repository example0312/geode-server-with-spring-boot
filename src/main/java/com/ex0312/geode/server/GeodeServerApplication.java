package com.ex0312.geode.server;

import com.ex0312.geode.domain.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@ComponentScan(basePackageClasses = Stock.class)
@CacheServerApplication(locators = "localhost[10334]")
@SpringBootApplication
public class GeodeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeodeServerApplication.class, args);
    }
}