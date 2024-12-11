package com.tutorial;

import com.tutorial.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ChangeNameBean {

  @Primary
  @Bean(name = "fooFirst")
  Foo foo1 () {
    return new Foo();
  }

  @Bean(name = "fooSecond")
  Foo foo2 () {
    return new Foo();
  }
}
