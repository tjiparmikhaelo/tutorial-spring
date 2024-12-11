package com.tutorial;

import com.tutorial.configuration.OptionalConfiguration;
import com.tutorial.data.Foo;
import com.tutorial.data.FooBar;
import com.tutorial.data.MultiFoo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialOptionalDependency {

  ConfigurableApplicationContext context;

  @BeforeEach
  void testUp() {
    context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    context.close();
  }

  @Test
  void testOptional() {
    Foo foo = context.getBean(Foo.class);
    FooBar fooBar = context.getBean(FooBar.class);

    Assertions.assertNull(fooBar.getBar());
    Assertions.assertSame(foo, fooBar.getFoo());
  }

  @Test
  void testObjectProvider() {
    MultiFoo multiFoo = context.getBean(MultiFoo.class);

    Assertions.assertEquals(3, multiFoo.getFoos().size());
  }
}
