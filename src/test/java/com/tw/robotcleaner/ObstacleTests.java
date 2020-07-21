package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObstacleTests {

  @Test
  public void testOneGridObstacleExists() {
    final Obstacle obstacle = new Obstacle(3, 4);
    assertEquals(obstacle.getBottomX(), 3);
    assertEquals(obstacle.getBottomY(), 4);
  }
  @Test
  public void testMultiGridObstacleExists() {
    final Obstacle obstacle = new Obstacle(1, 6,2,6);
    assertEquals(obstacle.getBottomX(), 1);
    assertEquals(obstacle.getBottomY(), 6);
    assertEquals(obstacle.getTopX(), 2);
    assertEquals(obstacle.getTopY(), 6);
  }

  @Test
  public void testObstacleOutsideRoom() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      final Room room = new Room(10, 15);
      final Obstacle obstacle = new Obstacle(2, 20);
      assertNull(room.getObstacle());
      room.setObstacle(obstacle);
    });
  }

  @Test
  public void testObstacleWithinRoom() {
    final Room room = new Room(10, 15);
    final Obstacle obstacle = new Obstacle(2, 5);
    assertNull(room.getObstacle());
    room.setObstacle(obstacle);
    assertNotNull(room.getObstacle());
  }
}
