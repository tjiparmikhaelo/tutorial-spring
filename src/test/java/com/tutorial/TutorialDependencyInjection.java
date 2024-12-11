package com.tutorial;

import com.tutorial.data.Bar;
import com.tutorial.data.Foo;
import com.tutorial.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TutorialDependencyInjection {

  @Test
  void testNoDI() {

    var foo = new Foo();
    var bar = new Bar();

    var fooBar = new FooBar(foo, bar);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());
  }

  @Test
  void testDI() {
    ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

    Foo foo = context.getBean(Foo.class);
    Bar bar = context.getBean(Bar.class);
    FooBar fooBar = context.getBean(FooBar.class);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());
  }
}
