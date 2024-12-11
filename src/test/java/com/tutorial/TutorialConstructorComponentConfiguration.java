package com.tutorial;

import com.tutorial.repository.ProductRepository;
import com.tutorial.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialConstructorComponentConfiguration {

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
  void testLifeCycle() {
    ProductRepository productRepository = context.getBean(ProductRepository.class);
    ProductService productService = context.getBean(ProductService.class);

    Assertions.assertNotNull(productRepository);
    Assertions.assertNotNull(productService);
    Assertions.assertSame(productRepository, productService.getProductRepository());
  }
}
