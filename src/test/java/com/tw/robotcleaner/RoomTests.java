package com.tw.robotcleaner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTests {

  @Test
  void testRoomExists() {
    final Room room = new Room(10, 15);
    assertEquals(room.getLength(), 10);
    assertEquals(room.getWidth(), 15);
  }
}
