package com.gs.linkedlist.common;

import com.gs.linkedlist.node.Node;

public class ReverseList<T> {

  public Node<T> reverse(Node<T> node) {

    if(node == null ) return node;
    
    Node<T> prev = null;

    while (node != null) {
      Node<T> tmp = node.next;
      node.next = prev;
      prev = node;
      node = tmp;
    }

    return prev;
  }
}
