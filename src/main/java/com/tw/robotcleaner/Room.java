package com.tw.robotcleaner;

import java.util.Objects;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Room {

  private int length;

  private int width;

  private Obstacle obstacle;

  public Room(final int length, final int width) {
    this.length = length;
    this.width = width;
  }

  public Room(final int length, final int width, final Obstacle obstacle) {
    this.length = length;
    this.width = width;
    this.setObstacle(obstacle);
  }

  public void setObstacle(final Obstacle obstacle) {
    if (obstacle.getX() > this.getLength() || obstacle.getY() > this.getWidth()) {
      throw new IllegalArgumentException("Obstacle cannot be placed outside the room.");
    } else {
      this.obstacle = obstacle;
    }
  }

  public boolean canMove(final int x, final int y) {
    return Objects.isNull(obstacle) || (x != obstacle.getX() && y != obstacle.getY());
  }

}
