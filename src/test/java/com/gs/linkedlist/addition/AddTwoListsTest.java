package com.gs.linkedlist.addition;
import org.junit.jupiter.api.Test;
import com.gs.linkedlist.node.Node;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoListsTest {

  private AddTwoLists addTwoLists = new AddTwoLists();
  
  @Test
  public void testScnerio1() {
    Node<Integer> list1 = new Node<Integer>(new Integer[] {3, 4, 2});
    Node<Integer> list2 = new Node<Integer>(new Integer[] {4, 6, 5});
    Node<Integer> output = addTwoLists.add(list1, list2);
    System.out.println(output);
    Node<Integer> expected = new Node<Integer>(new Integer[] {8, 0, 7});
    assertTrue(expected.equals(output));
  }
  
}
