package com.tw.robotcleaner.utils;

import com.tw.robotcleaner.enums.Direction;
import java.util.HashMap;
import java.util.Map;

public class Util {

  public static final Map<Direction,Integer> directionOrder = new HashMap<>();

  static {
    directionOrder.put(Direction.E,0);
    directionOrder.put(Direction.N,1);
    directionOrder.put(Direction.W,2);
    directionOrder.put(Direction.S,3);
  }



}
