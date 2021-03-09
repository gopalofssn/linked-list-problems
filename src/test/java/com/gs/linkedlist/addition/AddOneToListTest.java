package com.gs.linkedlist.addition;

import org.junit.jupiter.api.Test;
import com.gs.linkedlist.node.Node;
import static org.junit.jupiter.api.Assertions.*;

public class AddOneToListTest {

  private AddOneToList addOneToList = new AddOneToList();
  
  @Test
  public void testScnerio1() {
    Node<Integer> input = new Node<Integer>(new Integer[] {1, 2, 3});
    Node<Integer> output = addOneToList.addOne(input);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 2, 4});
    assertTrue(expected.equals(output));
  }
  
  
  @Test
  public void testScnerio2() {
    Node<Integer> input = new Node<Integer>(new Integer[] {9, 9 , 9});
    Node<Integer> output = addOneToList.addOne(input);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 0, 0, 0});
    assertTrue(expected.equals(output));
  }
  
}
