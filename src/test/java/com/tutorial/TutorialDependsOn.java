package com.tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialDependsOn {

  @Test
  void testDependsOn() {

    ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
  }
}
