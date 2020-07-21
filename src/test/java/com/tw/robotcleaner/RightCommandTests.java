package com.tw.robotcleaner;

import com.tw.robotcleaner.enums.Command;
import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Test;

public class RightCommandTests extends BaseTest {

  @Test
  void testCleanerMovement_North_Right() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N);
    cleaner.move(Command.R);
    assertCleaner(cleaner, 1, 2, Direction.E);
  }

  @Test
  void testCleanerMovement_South_Right() {
    final Cleaner cleaner = new Cleaner(2, 5, Direction.S);
    cleaner.move(Command.R);
    assertCleaner(cleaner, 2, 5, Direction.W);
  }

  @Test
  void testCleanerMovement_East_Right() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.E);
    cleaner.move(Command.R);
    assertCleaner(cleaner, 1, 2, Direction.S);
  }

  @Test
  void testCleanerMovement_West_Right() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.W);
    cleaner.move(Command.R);
    assertCleaner(cleaner, 1, 2, Direction.N);
  }

}
