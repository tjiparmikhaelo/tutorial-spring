package com.tutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.tutorial.service",
    "com.tutorial.repository"
})
public class ConstructorComponentConfiguration {
}
