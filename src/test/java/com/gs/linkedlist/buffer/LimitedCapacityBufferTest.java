package com.gs.linkedlist.buffer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LimitedCapacityBufferTest {

  private LimitedCapacityBuffer<Character> limitedCapacityBuffer;
  
  @Test
  public void testScnerio1() {
    limitedCapacityBuffer = new LimitedCapacityBuffer<Character>(5);
    assertEquals(3, limitedCapacityBuffer.write(new Character[]{'a','b','c'}));
    assertEquals(2, limitedCapacityBuffer.write(new Character[]{'e','f'}));
    assertEquals(0, limitedCapacityBuffer.write(new Character[]{'g','h'}));
    assertArrayEquals(new Character[] {'a', 'b', 'c'}, limitedCapacityBuffer.read(3));
    assertEquals(3, limitedCapacityBuffer.write(new Character[]{'x','y','z','a','b','c'}));
    assertArrayEquals(new Character[] {'e', 'f', 'x', 'y','z'}, limitedCapacityBuffer.read(8));
    assertEquals(3, limitedCapacityBuffer.write(new Character[]{'a','b','c'}));
    assertArrayEquals(new Character[] {'a', 'b', 'c'}, limitedCapacityBuffer.read(3));
    assertArrayEquals(new Character[0], limitedCapacityBuffer.read(3));

  }
}
