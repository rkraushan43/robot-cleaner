package com.tw.robotcleaner;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Obstacle {

  private int bottomX;

  private int bottomY;

  private int topX;

  private int topY;

  public Obstacle(final int bottomX, final int bottomY) {
    this.bottomX = bottomX;
    this.bottomY = bottomY;
    this.topX = bottomX;
    this.topY = bottomY;
  }

}
