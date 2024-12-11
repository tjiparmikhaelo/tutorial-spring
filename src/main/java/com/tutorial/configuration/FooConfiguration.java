package com.tutorial.configuration;

import com.tutorial.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class FooConfiguration {

  @Bean
  @Primary
  public Foo foo() {
    log.info("created foo bean");
    return new Foo();
  }

  @Bean
  public Foo foo2() {
    log.info("created foo bean");
    return new Foo();
  }

  @Bean
  public Foo foo3() {
    log.info("created foo bean");
    return new Foo();
  }
}
