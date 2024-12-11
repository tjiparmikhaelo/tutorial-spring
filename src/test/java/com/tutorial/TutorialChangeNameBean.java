package com.tutorial;

import com.tutorial.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialChangeNameBean {

  ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ChangeNameBean.class);
  }

  @Test
  void testChangeNameBean() {
    Foo foo = context.getBean(Foo.class);
    Foo foo1 = context.getBean("fooFirst", Foo.class);
    Foo foo2 = context.getBean("fooSecond", Foo.class);

    Assertions.assertNotNull(foo1);
    Assertions.assertNotNull(foo2);

    Assertions.assertSame(foo, foo1);
    Assertions.assertNotSame(foo1, foo2);
    Assertions.assertNotSame(foo, foo2);
  }
}
