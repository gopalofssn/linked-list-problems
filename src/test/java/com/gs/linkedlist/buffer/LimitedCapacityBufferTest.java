package com.gs.linkedlist.buffer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LimitedCapacityBufferTest {

  private LimitedCapacityBuffer limitedCapacityBuffer;
  
  @Test
  public void testScnerio1() {
    limitedCapacityBuffer = new LimitedCapacityBuffer(5);
    assertEquals(3, limitedCapacityBuffer.write(new char[]{'a','b','c'}));
    assertEquals(2, limitedCapacityBuffer.write(new char[]{'e','f'}));
    assertEquals(0, limitedCapacityBuffer.write(new char[]{'g','h'}));
    assertArrayEquals(new char[] {'a', 'b', 'c'}, limitedCapacityBuffer.read(3));
    assertEquals(3, limitedCapacityBuffer.write(new char[]{'x','y','z','a','b','c'}));
    assertArrayEquals(new char[] {'e', 'f', 'x', 'y','z'}, limitedCapacityBuffer.read(8));
    assertEquals(3, limitedCapacityBuffer.write(new char[]{'a','b','c'}));
    assertArrayEquals(new char[] {'a', 'b', 'c'}, limitedCapacityBuffer.read(3));
    assertArrayEquals(new char[0], limitedCapacityBuffer.read(3));

  }
}
