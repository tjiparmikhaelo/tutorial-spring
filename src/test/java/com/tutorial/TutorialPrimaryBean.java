package com.tutorial;

import com.tutorial.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialPrimaryBean {

  @Test
  void testPrimaryBean() {

    ApplicationContext  context = new AnnotationConfigApplicationContext(PrimaryBean.class);

    Foo foo = context.getBean(Foo.class);
    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);

    Assertions.assertSame(foo, foo1);
    Assertions.assertNotSame(foo1, foo2);
    Assertions.assertNotSame(foo, foo2);
  }
}
