package com.gs.linkedlist.node;

public class Node<T> {
  public T value;
  public Node<T> next;

  public Node(T value) {
    this.value = value;
  }
}