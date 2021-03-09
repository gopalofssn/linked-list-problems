package com.gs.linkedlist.deletion;

import com.gs.linkedlist.node.Node;

public class DeleteNode {

  public Node<Integer> delete(Node<Integer> head, int valueToDelete) {
    if (head == null) {
      return head;
    }

    while (head != null && head.value == valueToDelete) {
      head = head.next;
    }

    Node<Integer> node = head;
    Node<Integer> prev = null;
    while (node != null) {
      while (node != null && node.value == valueToDelete) {
        prev.next = node.next;
        node = node.next;
      }

      prev = node;
      node = node != null ? node.next : null;

    }

    return head;
  }
}
