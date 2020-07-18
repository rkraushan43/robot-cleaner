package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;
import com.tw.robotcleaner.enums.Signal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveCommandTests {

  @Test
  public void testNoRoomAssigned(){
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      final Cleaner cleaner = new Cleaner(0,0, Direction.W);
      cleaner.move(Signal.M);
    });
  }

  @Test
  public void testMoveNorthIfNotBlocked(){
    final Room room = new Room(10,15);
    final Cleaner cleaner = new Cleaner(2,3, Direction.N, room);

    cleaner.move(Signal.M);
    assertEquals(cleaner.getX(),2);
    assertEquals(cleaner.getY(),4);
    assertEquals(cleaner.getDirection(),Direction.N);
  }
  @Test
  public void testMoveSouthIfNotBlocked(){
    final Room room = new Room(10,15);
    final Cleaner cleaner = new Cleaner(2,3, Direction.S, room);

    cleaner.move(Signal.M);
    assertEquals(cleaner.getX(),2);
    assertEquals(cleaner.getY(),2);
    assertEquals(cleaner.getDirection(),Direction.S);
  }

  @Test
  public void testMoveEastIfNotBlocked(){
    final Room room = new Room(10,15);
    final Cleaner cleaner = new Cleaner(2,3, Direction.E, room);

    cleaner.move(Signal.M);
    assertEquals(cleaner.getX(),3);
    assertEquals(cleaner.getY(),3);
    assertEquals(cleaner.getDirection(),Direction.E);
  }

  @Test
  public void testMoveWestIfNotBlocked(){
    final Room room = new Room(10,15);
    final Cleaner cleaner = new Cleaner(2,3, Direction.W, room);

    cleaner.move(Signal.M);
    assertEquals(cleaner.getX(),1);
    assertEquals(cleaner.getY(),3);
    assertEquals(cleaner.getDirection(),Direction.W);
  }

  @Test
  public void testNotToMoveNorthIfBlocked(){
    final Room room = new Room(12,15);
    final Cleaner cleaner = new Cleaner(12,15, Direction.N, room);

    cleaner.move(Signal.M);
    assertEquals(cleaner.getX(),12);
    assertEquals(cleaner.getY(),15);
    assertEquals(cleaner.getDirection(),Direction.N);
  }

  @Test
  public void testNotToMoveSouthIfBlocked(){
    final Room room = new Room(12,15);
    final Cleaner cleaner = new Cleaner(0,0, Direction.S, room);

    cleaner.move(Signal.M);

    assertEquals(cleaner.getX(),0);
    assertEquals(cleaner.getY(),0);
    assertEquals(cleaner.getDirection(),Direction.S);
  }

  @Test
  public void testNotToMoveEastIfBlocked(){
    final Room room = new Room(12,15);
    final Cleaner cleaner = new Cleaner(12,15, Direction.E, room);

    cleaner.move(Signal.M);

    assertEquals(cleaner.getX(),12);
    assertEquals(cleaner.getY(),15);
    assertEquals(cleaner.getDirection(),Direction.E);
  }

  @Test
  public void testNotToMoveWestIfBlocked(){
    final Room room = new Room(12,15);
    final Cleaner cleaner = new Cleaner(0,0, Direction.W, room);

    cleaner.move(Signal.M);

    assertEquals(cleaner.getX(),0);
    assertEquals(cleaner.getY(),0);
    assertEquals(cleaner.getDirection(),Direction.W);
  }



}
