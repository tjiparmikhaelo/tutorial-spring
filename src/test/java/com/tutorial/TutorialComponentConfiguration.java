package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialComponentConfiguration {

  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testLifeCycle() {

    ProductService productService = context.getBean(ProductService.class);

    Assertions.assertNotNull(productService);
  }
}
