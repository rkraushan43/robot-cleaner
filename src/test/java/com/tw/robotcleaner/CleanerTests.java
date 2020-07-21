package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Command;
import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Test;

public class CleanerTests extends BaseTest{

  @Test
  void testCleanerExists() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N);
    assertCleaner(cleaner,1,2, Direction.N);
  }

  @Test
  public void testMultipleCommandsInput1(){
    final Room room = new Room(6, 6);
    final Obstacle obstacle = new Obstacle(3, 5);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N, room);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    cleaner.move(Command.M);
    assertCleaner(cleaner,1,3, Direction.N);
  }
  @Test
  public void testMultipleCommandsInput2(){
    final Room room = new Room(7, 7);
    final Obstacle obstacle = new Obstacle(1, 6,2,6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(3, 6, Direction.N, room);
    cleaner.move(Command.M);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    cleaner.move(Command.L);
    cleaner.move(Command.M);
    assertCleaner(cleaner,2,7, Direction.S);

  }
}
