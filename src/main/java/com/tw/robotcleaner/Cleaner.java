package com.tw.robotcleaner;

import com.tw.robotcleaner.enums.Command;
import com.tw.robotcleaner.enums.Direction;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cleaner {

  private int x;

  private int y;

  private Direction direction;

  private Room room;

  public Cleaner(final int x, final int y, final Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public void move(Command s) {

    switch (s) {
      case L:
        this.setDirection(this.getDirection().turnLeft());
        break;
      case R:
        this.setDirection(this.getDirection().turnRight());
        break;
      case M:
        if (Objects.isNull(this.getRoom())) {
          throw new UnsupportedOperationException("No room allocated for cleaning");
        }
        if (Direction.N.equals(this.getDirection()) && this.getY() < this.getRoom().getWidth()
            && this.getRoom().canMove(this.getX(), this.getY() + 1)) {
          this.setY(this.getY() + 1);
        }
        if (Direction.S.equals(this.getDirection()) && this.getY() > 0 && this.getRoom()
            .canMove(this.getX(), this.getY() - 1)) {
          this.setY(this.getY() - 1);
        }
        if (Direction.E.equals(this.getDirection()) && this.getX() < this.getRoom().getLength()
            && this.getRoom()
            .canMove(this.getX() + 1, this.getY())) {
          this.setX(this.getX() + 1);
        }
        if (Direction.W.equals(this.getDirection()) && this.getX() > 0 && this.getRoom()
            .canMove(this.getX() - 1, this.getY())) {
          this.setX(this.getX() - 1);
        }
        break;
    }

  }
}
