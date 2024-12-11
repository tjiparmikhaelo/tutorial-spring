package com.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TutorialSingleton {
  @Test
  void testSingleton() {
    var database1 = Database.getInstance();
    var database2 = Database.getInstance();

    Assertions.assertSame(database1, database2);
  }
}
