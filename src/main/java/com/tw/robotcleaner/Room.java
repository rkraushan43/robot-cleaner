package com.tw.robotcleaner;

import java.util.Objects;
import lombok.Getter;

@Getter
public class Room {

  private int length;

  private int width;

  private Obstacle obstacle;

  public Room(final int length, final int width) {
    this.length = length;
    this.width = width;
  }

  public void setObstacle(final Obstacle obstacle) {
    if (obstacle.getBottomX() > this.getLength() || obstacle.getBottomY() > this.getWidth()) {
      throw new IllegalArgumentException("Obstacle cannot be placed outside the room.");
    } else {
      this.obstacle = obstacle;
    }
  }

  public boolean canMove(final int x, final int y) {
    return Objects.isNull(obstacle) || x < obstacle.getBottomX() || x > obstacle.getTopX()
        || y < obstacle.getBottomY() || y > obstacle.getTopY();
  }

}
