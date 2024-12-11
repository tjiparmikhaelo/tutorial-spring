package com.tutorial;

import com.tutorial.data.Car;
import com.tutorial.processor.IdGeneratorBeanPostProcessor;
import com.tutorial.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class TutorialBeanPostProcessor {

  @Configuration
  @Import({
      Car.class,
      IdGeneratorBeanPostProcessor.class
  })
  public static class TestConfiguration {}

  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(TestConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testBeanPostProcessor() {
    Car car = context.getBean(Car.class);

    System.out.println(car.getId());
    Assertions.assertNotNull(car.getId());
  }
}
