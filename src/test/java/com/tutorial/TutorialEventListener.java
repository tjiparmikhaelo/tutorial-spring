package com.tutorial;

import com.tutorial.listener.LoginSuccessListener;
import com.tutorial.listener.UserListener;
import com.tutorial.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class TutorialEventListener {

  @Configuration
  @Import({
      UserService.class,
      LoginSuccessListener.class,
      UserListener.class
  })
  public static class TestConfiguration {}

  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    context.registerShutdownHook();
  }

  @Test
  void testEventListener() {

    UserService userService = context.getBean(UserService.class);

    userService.login("azza", "azza");
    userService.login("theo", "azza");
    userService.login("azza", "theo");
    userService.login("theo", "theo");
  }
}
