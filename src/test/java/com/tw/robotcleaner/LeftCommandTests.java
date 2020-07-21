package com.tw.robotcleaner;


import com.tw.robotcleaner.enums.Command;
import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Test;

public class LeftCommandTests extends BaseTest {

  @Test
  void testCleanerMovement_North_Left() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N);
    cleaner.move(Command.L);
    assertCleaner(cleaner, 1, 2, Direction.W);
  }

  @Test
  void testCleanerMovement_South_Left() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.S);
    cleaner.move(Command.L);
    assertCleaner(cleaner, 1, 2, Direction.E);
  }

  @Test
  void testCleanerMovement_East_Left() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.E);
    cleaner.move(Command.L);
    assertCleaner(cleaner, 1, 2, Direction.N);
  }

  @Test
  void testCleanerMovement_West_Left() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.W);
    cleaner.move(Command.L);
    assertCleaner(cleaner, 1, 2, Direction.S);
  }
}
