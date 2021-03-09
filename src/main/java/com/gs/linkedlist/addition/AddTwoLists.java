package com.gs.linkedlist.addition;

import com.gs.linkedlist.node.Node;

public class AddTwoLists {

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
    while (list2 != null) {
      int value = list1.value + list2.value + carry;
      list1.value = value % 10;
      carry = carry / 10;
      
      prev = list1;
      list1 = list1.next;
      list2 = list2.next;
    }
    System.err.println(prev);
    addCarryToList(prev, carry);
    return list;
  }



  private void addCarryToList(Node<Integer> node, int carry) {
    Node<Integer> prev = null;
    while(node != null && carry != 0) {
      int value = node.value + carry;
      node.value = value % 10;
      carry = value / 10;
      prev = node;
      node = node.next;
    }
    
    if(carry != 0) {
      prev.next = new Node<Integer>(carry);
    }
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
