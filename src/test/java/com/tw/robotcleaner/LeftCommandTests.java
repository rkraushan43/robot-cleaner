package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;
import com.tw.robotcleaner.enums.Signal;
import org.junit.jupiter.api.Test;

public class LeftCommandTests {

  @Test
  void testCleanerMovement_North_Left(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.N);
    cleaner.move(Signal.L);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.W);

  }
  @Test
  void testCleanerMovement_South_Left(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.S);
    cleaner.move(Signal.L);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.E);

  }
  @Test
  void testCleanerMovement_East_Left(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.E);
    cleaner.move(Signal.L);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.N);
  }
  @Test
  void testCleanerMovement_West_Left(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.W);
    cleaner.move(Signal.L);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.S);

  }
}
