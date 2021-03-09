package com.gs.linkedlist.addition;

import com.gs.linkedlist.node.Node;
/**
 * 
 * @author Gopal Selvaraj
 * Time : O(n)
 * Space : O(1)
 * 
 * but we will loss original list1
 */
public class AddTwoListsUsingMemoryOptimized  implements AddTwoLists{

  private int size = 0;

  public Node<Integer> add(Node<Integer> list1, Node<Integer> list2) {

    if (list1 == null && list2 == null) {
      throw new IllegalArgumentException("Invalid list(s)");
    }

    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    Node<Integer> list1Reversed = reverse(list1);
    int list1Size = size;
    Node<Integer> list2Reversed = reverse(list2);
    int list2Size = size;

    Node<Integer> reversedResult;
    if (list1Size >= list2Size) {
      reversedResult = addUtil(list1Reversed, list2Reversed);
    } else {
      reversedResult = addUtil(list2Reversed, list1Reversed);
    }
    return reverse(reversedResult);
  }


  private Node<Integer> addUtil(Node<Integer> list1, Node<Integer> list2) {
    int carry = 0;
    Node<Integer> list = list1;
    Node<Integer> prev = null;
    while (list1 != null && (list2 != null || carry != 0)) {
      int value = list1.value + carry;

      if (list2 != null) {
        value += list2.value;
        list2 = list2.next;
      }

      list1.value = value % 10;
      prev = list1;
      list1 = list1.next;
      carry = value / 10;
    }
    if (carry != 0) {
      prev.next = new Node<Integer>(carry);
    }
    return list;
  }

  private Node<Integer> reverse(Node<Integer> node) {
    size = 0;
    Node<Integer> prev = null;
    while (node != null) {
      Node<Integer> nodeNext = node.next;
      node.next = prev;
      prev = node;
      node = nodeNext;
      size++;
    }
    return prev;
  }

}
