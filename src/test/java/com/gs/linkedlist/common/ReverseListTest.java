package com.gs.linkedlist.common;

import org.junit.jupiter.api.Test;
import com.gs.linkedlist.node.Node;

public class ReverseListTest {

  private ReverseList reverseList = new ReverseList();
  
  @Test
  public void testCase1(){
    Node<Character> node2 = new Node<Character>('A');
    node2.next = new Node<Character>('B');
  }
}
