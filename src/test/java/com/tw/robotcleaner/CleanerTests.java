package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Test;

public class CleanerTests {

  @Test
  void testCleanerExists() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N);
    assertEquals(cleaner.getX(), 1);
    assertEquals(cleaner.getY(), 2);
    assertEquals(cleaner.getDirection(), Direction.N);
  }
}
