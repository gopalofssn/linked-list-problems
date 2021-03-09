package com.gs.linkedlist.reorder;

import org.junit.jupiter.api.Test;
import com.gs.linkedlist.node.Node;
import static org.junit.jupiter.api.Assertions.*;

public class ListReorderTest {

  private ListReorder listReorder = new ListReorder();

  @Test
  public void testEvenCout() {
    Node<Integer> input = new Node<Integer>(new Integer[] {1, 2, 3, 4, 5, 6});
    Node<Integer> output = listReorder.reorder(input);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 6, 2, 5, 3, 4});
    assertTrue(expected.equals(output));
  }

  @Test
  public void testOddCout() {
    Node<Integer> input = new Node<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7});
    Node<Integer> output = listReorder.reorder(input);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 7, 2, 6, 3, 5, 4});
    assertTrue(expected.equals(output));
  }


}
