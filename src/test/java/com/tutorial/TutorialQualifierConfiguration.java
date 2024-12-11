package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.repository.CustomerRepository;
import com.tutorial.service.CustomerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialQualifierConfiguration {

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
    CustomerService customerService = context.getBean(CustomerService.class);

    Assertions.assertNotNull(customerService);
  }
}
