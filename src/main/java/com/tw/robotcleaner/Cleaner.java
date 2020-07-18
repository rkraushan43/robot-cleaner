package com.tw.robotcleaner;

import com.tw.robotcleaner.enums.Direction;
import com.tw.robotcleaner.enums.Signal;
import java.util.Objects;

public class Cleaner {

  private int x;

  private int y;

  private Direction direction;

  private Room room;

  public Cleaner() {
    this.x = 0;
    this.y = 0;
    this.direction = Direction.E;
  }

  public Cleaner(final int x, final int y, final Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public Cleaner(final int x, final int y, final Direction direction, final Room room) {
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.room = room;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public void move(Signal s) {

    switch (s) {
      case L:
        if (Direction.N.equals(this.getDirection())) {
          this.direction = Direction.W;
        } else if (Direction.S.equals(this.getDirection())) {
          this.direction = Direction.E;
        } else if (Direction.E.equals(this.getDirection())) {
          this.direction = Direction.N;
        } else if (Direction.W.equals(this.getDirection())) {
          this.direction = Direction.S;
        }
        break;
      case R:
        if (Direction.N.equals(this.getDirection())) {
          this.direction = Direction.E;
        } else if (Direction.S.equals(this.getDirection())) {
          this.direction = Direction.W;
        } else if (Direction.E.equals(this.getDirection())) {
          this.direction = Direction.S;
        } else if (Direction.W.equals(this.getDirection())) {
          this.direction = Direction.N;
        }
        break;
      case M:
        if(Objects.isNull(this.getRoom())){
          throw new UnsupportedOperationException("No room allocated for cleaning");
        }
        if(Direction.N.equals(this.getDirection()) && this.getY() < this.getRoom().getWidth()){
          this.setY(this.getY()+1);
        }
        if(Direction.S.equals(this.getDirection()) && this.getY() > 0){
          this.setY(this.getY()-1);
        }
        if(Direction.E.equals(this.getDirection()) && this.getX() < this.getRoom().getLength()){
          this.setX(this.getX()+1);
        }
        if(Direction.W.equals(this.getDirection()) && this.getX() > 0){
          this.setX(this.getX()-1);
        }
        break;
    }

  }
}
