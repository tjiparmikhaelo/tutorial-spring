package com.tutorial;

import com.tutorial.client.PaymentGatewayClient;
import com.tutorial.factory.PaymentGatewayClientFactoryBean;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialFactoryBean {
  ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(PaymentGatewayClientFactoryBean.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testFactoryBean() {
    PaymentGatewayClient client = context.getBean(PaymentGatewayClient.class);

    Assertions.assertNotNull(client);
    Assertions.assertEquals("https://google.com", client.getEndpoint());
    Assertions.assertEquals("slang", client.getPrivateKey());
    Assertions.assertEquals("null", client.getPublicKey());
  }
}
