package com.tutorial;

import com.tutorial.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FooConfiguration {

  @Bean
  public Foo foo() {
    log.info("created foo bean");
    return new Foo();
  }
}
