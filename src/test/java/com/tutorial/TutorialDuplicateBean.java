package com.tutorial;

import com.tutorial.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialDuplicateBean {

  @Test
  void testDuplicate() {

    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

    Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
      Foo foo = context.getBean(Foo.class);
    });
  }

  @Test
  void getBean() {

    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);

    Assertions.assertNotSame(foo1, foo2);
  }
}
