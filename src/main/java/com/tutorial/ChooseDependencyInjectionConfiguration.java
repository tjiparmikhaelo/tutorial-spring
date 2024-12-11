package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ChooseDependencyInjectionConfiguration {

  @Bean
  public Foo fooFirst() {
    return new Foo();
  }

  @Bean
  public Foo fooSecond() {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return new Bar();
  }

  @Bean
  public FooBar fooBar(@Qualifier(value = "fooSecond") Foo foo, Bar bar) {
    return new FooBar(foo, bar);
  }
}
