package com.gs.linkedlist.deletion;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.gs.linkedlist.node.Node;

public class DeleteNodeTest {

  private DeleteNode deleteNode = new DeleteNode();
  
  @Test
  public void testCase1() {
    Node<Integer> input = new Node<Integer>(new Integer[]{1, 1, 1});
    Node<Integer> output = deleteNode.delete(input, 1);
    assertNull(output);
  }
  
  @Test
  public void testCase2() {
    Node<Integer> input = new Node<Integer>(new Integer[]{2, 1, 1, 1, 3});
    Node<Integer> output = deleteNode.delete(input, 1);
    Node<Integer> expected = new Node<Integer>(new Integer[]{2, 3});
    assertTrue(expected.equals(output));
  }
  
  @Test
  public void testCase3() {
    Node<Integer> input = new Node<Integer>(new Integer[]{1, 1, 1, 2, 3});
    Node<Integer> output = deleteNode.delete(input, 1);
    Node<Integer> expected = new Node<Integer>(new Integer[]{2, 3});
    assertTrue(expected.equals(output));
  }
  
  @Test
  public void testCase4() {
    Node<Integer> input = new Node<Integer>(new Integer[]{2, 3, 1, 1, 1});
    Node<Integer> output = deleteNode.delete(input, 1);
    Node<Integer> expected = new Node<Integer>(new Integer[]{2, 3});
    assertTrue(expected.equals(output));
  }
  
}
