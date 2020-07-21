package com.tw.robotcleaner;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tw.robotcleaner.enums.Direction;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void testRoomExists() {
    final Room room = new Room(10, 15);
    assertEquals(room.getLength(), 10);
    assertEquals(room.getWidth(), 15);
  }

  @Test
  void testCleanerExists() {
    final Cleaner cleaner = new Cleaner(1, 2, Direction.N);
    assertEquals(cleaner.getX(), 1);
    assertEquals(cleaner.getY(), 2);
    assertEquals(cleaner.getDirection(), Direction.N);
  }


}
