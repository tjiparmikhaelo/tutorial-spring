package com.tutorial;

import com.tutorial.repository.CategoryRepository;
import com.tutorial.repository.CustomerRepository;
import com.tutorial.service.CategoryService;
import com.tutorial.service.CustomerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialFieldBasedDI {

  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ConstructorComponentConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testSetterBasedDI() {
    CustomerService customerService = context.getBean(CustomerService.class);
    CustomerRepository customerRepository = context.getBean(CustomerRepository.class);

    Assertions.assertNotNull(customerService);
    Assertions.assertNotNull(customerRepository);
//    Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
  }
}
