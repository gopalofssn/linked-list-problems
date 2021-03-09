package com.gs.linkedlist.addition;

import com.gs.linkedlist.node.Node;

/**
 * 
 * @author Gopal Selvaraj
 *
 *         [1 2 3] + 1 = [1 2 4] 
 *         [9 9 9] + 1 = [1 0 0 0]
 * 
 */
public class AddOneToList {

  public Node<Integer> addOne(Node<Integer> head) {

    Node<Integer> reversed = reverse(head);
    Node<Integer> onePlus = addOneHelper(reversed);

    return reverse(onePlus);
  }

  private Node<Integer> addOneHelper(Node<Integer> head) {
    int carry = 1;
    Node<Integer> node = head;
    Node<Integer> prev = null;
    while(node != null) {
      int value = node.value + carry;
      node.value = value % 10;
      carry = value / 10;
      prev = node;
      node = node.next;
    }
    
    if(carry != 0) {
      prev.next = new Node<Integer>(carry);
    }
    return head;
  }

  private Node<Integer> reverse(Node<Integer> node) {
    Node<Integer> prev = null;
    while (node != null) {
      Node<Integer> nodeNext = node.next;
      node.next = prev;
      prev = node;
      node = nodeNext;
    }
    return prev;
  }

}
