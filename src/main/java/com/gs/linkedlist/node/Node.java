package com.gs.linkedlist.node;

public class Node<T> {
  public T data;
  public Node<T> next;

  public Node(T value) {
    this.data = value;
  }

  public Node(T[] values) {
    if(values == null || values.length == 0) {
      throw new IllegalArgumentException("values can not be blank");
    }
    this.data = values[0];
    Node<T> node = this;
    for(int index = 1; index < values.length; index++) {
      node.next = new Node<T>(values[index]);
      node = node.next;
    }
    
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Node)) {
      return false;
    }

    Node<T> that = (Node<T>) obj;
    if (that.data != this.data) {
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

  @Override
  public String toString() {
     StringBuilder sb = new StringBuilder();
     Node<T> node = this;
     while(node != null) {
       sb.append(node.data + "->");
       node = node.next;
     }
     sb.append("NULL");
     return sb.toString();
  }
  
}
