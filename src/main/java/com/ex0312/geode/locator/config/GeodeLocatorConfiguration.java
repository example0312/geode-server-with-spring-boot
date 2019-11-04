package com.ex0312.geode.locator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;

@EnableLocator
@EnableManager(start = true)
@Configuration
public class GeodeLocatorConfiguration {
}