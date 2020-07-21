package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObstacleTests {

  @Test
  public void testObstacleExists() {
    final Obstacle obstacle = new Obstacle(3, 4);
    assertEquals(obstacle.getX(), 3);
    assertEquals(obstacle.getY(), 4);
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
