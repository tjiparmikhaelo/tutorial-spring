package com.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialCyclicDependency {

  @Test
  void testCyclic() {

//    ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);

    Assertions.assertThrows(Throwable.class, () -> {
      ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
    });
  }
}
