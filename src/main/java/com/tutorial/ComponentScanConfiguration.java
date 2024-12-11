package com.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
    "com.tutorial.configuration",
    "com.tutorial.service",
    "com.tutorial.repository",
})
public class ComponentScanConfiguration {
}
