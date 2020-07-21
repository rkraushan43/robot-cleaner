package com.tw.robotcleaner.enums;

public enum Direction {
  N(0),W(1),S(2),E(3);

  private int order;

  Direction(final int order){
    this.order=order;
  }

  private static Direction[] vals= values();

  public int getOrder() {
    return order;
  }

  public Direction turnLeft(){
    return vals[(this.getOrder() + 1) % vals.length];
  }
  public Direction turnRight(){
    return vals[(vals.length + this.getOrder() - 1) % vals.length];
  }
}
