package com.gs.linkedlist.node;

public class DoublyLinkedListNode<E> {

	public E value;
	public DoublyLinkedListNode<E> prev;
	public DoublyLinkedListNode<E> next;
	
	public DoublyLinkedListNode(E value) {
		this.value = value;	
	}

	public DoublyLinkedListNode() {
		this(null);
	}
	
}
