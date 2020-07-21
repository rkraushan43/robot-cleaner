package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;

public class BaseTest {

  public void assertCleaner(final Cleaner cleaner, final int x, final int y,
      final Direction direction) {
    assertEquals(cleaner.getX(), x);
    assertEquals(cleaner.getY(), y);
    assertEquals(cleaner.getDirection(), direction);
  }
}
