package com.tutorial;

import com.tutorial.data.Foo;
import com.tutorial.processor.FooBeanFactoryPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class TutorialBeanFactoryPostProcessor {

  @Configuration
  @Import({
      FooBeanFactoryPostProcessor.class
  })
  public static class TestConfiguration {}

  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    context.registerShutdownHook();
  }

  @Test
  void testPostProcessor() {

    Foo foo = context.getBean(Foo.class);

    Assertions.assertNotNull(foo);
  }
}
