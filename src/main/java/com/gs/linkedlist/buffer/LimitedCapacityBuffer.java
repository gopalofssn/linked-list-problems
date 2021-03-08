package com.gs.linkedlist.buffer;

import com.gs.linkedlist.node.Node;

/**
 * 
 * @author Gopal Selvaraj
 * buffer only can hold capacity
 */

public class LimitedCapacityBuffer {

  private final int capacity;
  private int currentCapacity;
  private Node<Character> head;
  private Node<Character> tail;

  public LimitedCapacityBuffer(int capacity) {
    this.capacity = capacity;
    head = tail;
  }

  public int write(char[] chars) {
    if (currentCapacity == capacity) {
      return 0;
    }

    int index = 0;
    while (currentCapacity < capacity && index < chars.length) {
      addToBuffer(chars[index]);
      index++;
    }

    return index;
  }

  public char[] read(int n) {
    if (currentCapacity == 0) {
      return new char[0];
    }
    int max = Math.min(currentCapacity ,n);
    char[] result = new char[max];
    int index = 0;
    while (index < max) {
      result[index] = readFromBuffer();
      index++;
    }

    return result;
  }

  private char readFromBuffer() {
    currentCapacity--;
    char c = head.value;
    head = head.next;
    return c;
  }

  private void addToBuffer(char c) {
    currentCapacity++;
    Node<Character> node = new Node<Character>(c);
    if (head == null) {
      head = node;
      tail = head;
      return;
    }
    tail.next = node;
    tail = tail.next;
  }


}
