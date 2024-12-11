package com.tutorial;

import com.tutorial.factory.PaymentGatewayClientFactoryBean;
import com.tutorial.service.MerchantService;
import com.tutorial.service.MerchantServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialInheritance {
  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testInheritance() {
    MerchantService merchantService = context.getBean(MerchantService.class);
    MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService, merchantServiceImpl);
  }
}
