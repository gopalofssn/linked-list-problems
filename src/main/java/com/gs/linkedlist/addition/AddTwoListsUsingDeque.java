package com.gs.linkedlist.addition;

import java.util.ArrayDeque;
import java.util.Deque;
import com.gs.linkedlist.node.Node;

/**
 * 
 * @author Gopal Selvaraj
 *
 *         Time : O(n) 
 *         Space : O(1) , constant space for Deque
 * 
 */

public class AddTwoListsUsingDeque implements AddTwoLists {

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

    Deque<Node<Integer>> stack1 = buildStack(list1);
    Deque<Node<Integer>> stack2 = buildStack(list2);

    if (stack1.size() >= stack2.size()) {
      return addHelper(stack1, stack2);
    } else {
      return addHelper(stack2, stack1);
    }
  }

  private Node<Integer> addHelper(Deque<Node<Integer>> big, Deque<Node<Integer>> small) {
    Node<Integer> result = big.peekLast(); //
    int carry = 0;
    while(!big.isEmpty() && (!small.isEmpty() || carry != 0)) {
      Node<Integer> node = big.pop();
      int value = node.data + carry;
      if(!small.isEmpty()) {
        value += small.pop().data;
      }
      node.data = value % 10;
      carry = value / 10;
    }
     
    if(carry != 0) {
      Node<Integer> node = new Node<Integer>(carry);
      node.next = result;
      return node;
    }

    return result;
  }

  private Deque<Node<Integer>> buildStack(Node<Integer> node) {
    Deque<Node<Integer>> deque = new ArrayDeque<Node<Integer>>();
    while (node != null) {
      deque.push(node); // equal to addFirst , top 
      node = node.next;
    }

    return deque;
  }

}
