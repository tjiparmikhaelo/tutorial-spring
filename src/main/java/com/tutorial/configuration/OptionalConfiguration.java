package com.tutorial.configuration;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.data.FooBar;
import com.tutorial.data.MultiFoo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Optional;

@Slf4j
@Configuration
@Import(
    MultiFoo.class
)
public class OptionalConfiguration {

  @Bean
  public Foo foo() {
    log.error("foo created");
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }
}
