package com.tutorial;

import com.tutorial.data.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialLifeCycle {

  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testLifeCycle() {

    Connection connection = context.getBean(Connection.class);
  }
}
