package com.tutorial;

import com.tutorial.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBean {

  @Bean
  Foo foo1 () {
    return new Foo();
  }

  @Bean
  Foo foo2 () {
    return new Foo();
  }
}
