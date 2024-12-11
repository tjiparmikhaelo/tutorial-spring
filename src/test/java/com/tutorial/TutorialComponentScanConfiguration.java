package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialComponentScanConfiguration {

  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testLifeCycle() {

    Foo foo = context.getBean(Foo.class);
    Bar bar = context.getBean(Bar.class);

    Assertions.assertNotNull(foo);
    Assertions.assertNotNull(bar);
  }
}
