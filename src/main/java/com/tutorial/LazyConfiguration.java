package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.data.FooBar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class LazyConfiguration {

  @Bean
  public Foo foo() {
    log.info("creating new foo bean");
    return new Foo();
  }

  @Bean
  public Bar bar() {
    log.info("creating new bar bean");
    return new Bar();
  }

  @Lazy
  @Bean
  @DependsOn({
      "foo",
      "bar"
  })
  public FooBar fooBar(Foo foo, Bar bar) {
    log.info("creating bean foobar");
    return new FooBar(foo, bar);
  }
}
