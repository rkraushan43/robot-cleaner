package com.tw.robotcleaner;


import com.tw.robotcleaner.enums.Command;
import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveCommandTests extends BaseTest {

  @Test
  public void testNoRoomAssigned() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      final Cleaner cleaner = new Cleaner(0, 0, Direction.W);
      cleaner.move(Command.M);
    });
  }

  @Test
  public void testMoveNorthIfNotBlocked() {
    final Room room = new Room(10, 15);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.N, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 2, 4, Direction.N);
  }

  @Test
  public void testMoveSouthIfNotBlocked() {
    final Room room = new Room(10, 15);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.S, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 2, 2, Direction.S);
  }

  @Test
  public void testMoveEastIfNotBlocked() {
    final Room room = new Room(10, 15);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.E, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 3, 3, Direction.E);
  }

  @Test
  public void testMoveWestIfNotBlocked() {
    final Room room = new Room(10, 15);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.W, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 1, 3, Direction.W);
  }

  @Test
  public void testNotToMoveNorthIfBlocked() {
    final Room room = new Room(12, 15);
    final Cleaner cleaner = new Cleaner(12, 15, Direction.N, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 12, 15, Direction.N);
  }

  @Test
  public void testNotToMoveSouthIfBlocked() {
    final Room room = new Room(12, 15);
    final Cleaner cleaner = new Cleaner(0, 0, Direction.S, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 0, 0, Direction.S);
  }

  @Test
  public void testNotToMoveEastIfBlocked() {
    final Room room = new Room(12, 15);
    final Cleaner cleaner = new Cleaner(12, 15, Direction.E, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 12, 15, Direction.E);
  }

  @Test
  public void testNotToMoveWestIfBlocked() {
    final Room room = new Room(12, 15);
    final Cleaner cleaner = new Cleaner(0, 0, Direction.W, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 0, 0, Direction.W);
  }

  @Test
  public void testMoveNorthIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.N, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 2, 4, Direction.N);
  }

  @Test
  public void testMoveSouthIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.S, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 2, 2, Direction.S);
  }

  @Test
  public void testMoveEastIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.E, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 3, 3, Direction.E);
  }

  @Test
  public void testMoveWestIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(2, 3, Direction.W, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 1, 3, Direction.W);
  }

  @Test
  public void testNotToMoveNorthIfCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(5, 5, Direction.N, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 5, 5, Direction.N);
  }

  @Test
  public void testNotToMoveSouthIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(5, 7, Direction.S, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 5, 7, Direction.S);
  }

  @Test
  public void testNotToMoveEastIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(4, 6, Direction.E, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 4, 6, Direction.E);
  }

  @Test
  public void testNotToMoveWestIfNoCollision() {
    final Room room = new Room(12, 15);
    final Obstacle obstacle = new Obstacle(5, 6);
    room.setObstacle(obstacle);
    final Cleaner cleaner = new Cleaner(6, 6, Direction.W, room);
    cleaner.move(Command.M);
    assertCleaner(cleaner, 6, 6, Direction.W);
  }


}
