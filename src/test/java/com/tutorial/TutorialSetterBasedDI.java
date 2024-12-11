package com.tutorial;

import com.tutorial.repository.CategoryRepository;
import com.tutorial.service.CategoryService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialSetterBasedDI {

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
    CategoryService categoryService = context.getBean(CategoryService.class);
    CategoryRepository categoryRepository= context.getBean(CategoryRepository.class);

    Assertions.assertNotNull(categoryService);
    Assertions.assertNotNull(categoryRepository);
    Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
  }
}
