package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;
import com.tw.robotcleaner.enums.Signal;
import org.junit.jupiter.api.Test;

public class RightCommandTests {

  @Test
  void testCleanerMovement_North_Right(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.N);
    cleaner.move(Signal.R);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.E);

  }

  @Test
  void testCleanerMovement_South_Right(){
    final Cleaner cleaner = new Cleaner(2,5, Direction.S);
    cleaner.move(Signal.R);
    assertEquals(cleaner.getX(),2);
    assertEquals(cleaner.getY(),5);
    assertEquals(cleaner.getDirection(),Direction.W);

  }
  @Test
  void testCleanerMovement_East_Right(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.E);
    cleaner.move(Signal.R);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.S);

  }
  @Test
  void testCleanerMovement_West_Right(){
    final Cleaner cleaner = new Cleaner(1,2, Direction.W);
    cleaner.move(Signal.R);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.N);

  }

}
