package com.tutorial.application;

import com.tutorial.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBoot {

  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(FooApplication.class);
  }

  @Test
  void testSpringBoot() {
    Foo foo = context.getBean(Foo.class);
  }
}
