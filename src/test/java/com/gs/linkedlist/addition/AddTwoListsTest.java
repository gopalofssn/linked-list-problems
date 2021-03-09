package com.gs.linkedlist.addition;
 
import static org.junit.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.gs.linkedlist.node.Node;
 

public class AddTwoListsTest {

  @DataProvider
  public AddTwoLists[] addTwoListsProvider() {
    return new AddTwoLists[] {
        new AddTwoListsUsingMemoryOptimized(),
        new AddTwoListsUsingDeque()
    };
  }
  
  @Test(dataProvider = "addTwoListsProvider")
  public void testScnerio1(AddTwoLists addTwoLists) {
    Node<Integer> list1 = new Node<Integer>(new Integer[] {4, 4, 2});
    Node<Integer> list2 = new Node<Integer>(new Integer[] {4, 6, 5});
    Node<Integer> output = addTwoLists.add(list1, list2);
    Node<Integer> expected = new Node<Integer>(new Integer[] {9, 0, 7});
    assertTrue(expected.equals(output));
  }
  
  @Test(dataProvider = "addTwoListsProvider")
  public void testScnerio2(AddTwoLists addTwoLists) {
    Node<Integer> list1 = new Node<Integer>(new Integer[] {9, 0, 0, 1});
    Node<Integer> list2 = new Node<Integer>(new Integer[] {9, 9, 9});
    Node<Integer> output = addTwoLists.add(list1, list2);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 0, 0, 0, 0});
    assertTrue(expected.equals(output));
  }
  
  @Test(dataProvider = "addTwoListsProvider")
  public void testScnerio3(AddTwoLists addTwoLists) {
    Node<Integer> list1 = new Node<Integer>(new Integer[] {9, 9, 0, 1});
    Node<Integer> list2 = new Node<Integer>(new Integer[] { 9, 9});
    Node<Integer> output = addTwoLists.add(list1, list2);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 0, 0, 0, 0});
    assertTrue(expected.equals(output));
  }
  
  @Test(dataProvider = "addTwoListsProvider")
  public void testScnerio4(AddTwoLists addTwoLists) {
    Node<Integer> list1 = new Node<Integer>(new Integer[] {5, 0, 1});
    Node<Integer> list2 = new Node<Integer>(new Integer[] {5, 0, 1});
    Node<Integer> output = addTwoLists.add(list1, list2);
    Node<Integer> expected = new Node<Integer>(new Integer[] {1, 0, 0, 2});
    assertTrue(expected.equals(output));
  }
  
}
