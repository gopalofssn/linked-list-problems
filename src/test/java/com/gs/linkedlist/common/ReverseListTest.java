package com.gs.linkedlist.common;


import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gs.linkedlist.node.Node;

public class ReverseListTest {

  private ReverseList<Character> reverseList = new ReverseList<Character>();
  
  @Test
  public void testCase1(){
    Node<Character> input = new Node<Character>(new Character[]{'A','B'});
    Node<Character> output = reverseList.reverse(input);
    Node<Character> expected = new Node<Character>(new Character[]{'B','A'});
    
    assertTrue(expected.equals(output));
  }
  
  @Test
  public void testNull() {
    Node<Character> output = reverseList.reverse(null);
    assertNull(output);
  }
}
