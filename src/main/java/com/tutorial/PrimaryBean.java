package com.tutorial;

import com.tutorial.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBean {

  @Primary
  @Bean
  Foo foo1() {
    return new Foo();
  }

  @Bean
  Foo foo2() {
    return new Foo();
  }
}