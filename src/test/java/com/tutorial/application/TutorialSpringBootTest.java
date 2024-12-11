package com.tutorial.application;

import com.tutorial.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class TutorialSpringBootTest {

  @Autowired
  Foo foo;

  @Test
  void testSpringApplication() {
    Assertions.assertNotNull(foo);
  }
}
