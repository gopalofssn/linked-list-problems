package com.gs.linkedlist.node;

public class Node<T> {
  public T value;
  public Node<T> next;

  public Node(T value) {
    this.value = value;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Node)) {
      return false;
    }

    Node<T> that = (Node<T>) obj;
    if (that.value != this.value) {
      return false;
    }

    if (this.next == that.next) {
      return true;
    }

    if (this.next == null) {
      return false;
    }

    return this.next.equals(that.next);
  }

  public static void main(String[] args) {

    Node<Integer> node1 = new Node<Integer>(65);
    node1.next = new Node<Integer>(66);

    Node<Character> node2 = new Node<Character>('A');
    node2.next = new Node<Character>('B');

    System.out.println(node1.equals(node2));
  }
}
