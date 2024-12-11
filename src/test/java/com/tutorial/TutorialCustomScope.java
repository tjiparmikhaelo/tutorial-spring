package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialCustomScope {

  ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(CustomScopeConfiguration.class);
  }

  @Test
  void testCustomScope() {
    Bar bar1 = context.getBean(Bar.class);
    Bar bar2 = context.getBean(Bar.class);
    Bar bar3 = context.getBean(Bar.class);
    Bar bar4 = context.getBean(Bar.class);

    Assertions.assertSame(bar1, bar3);
    Assertions.assertSame(bar2, bar4);
    Assertions.assertNotSame(bar1, bar2);
    Assertions.assertNotSame(bar3, bar4);
  }
}
