package com.gs.linkedlist.node;

public class DoublyLinkedListNode<E> {

	public E data;
	public DoublyLinkedListNode<E> prev;
	public DoublyLinkedListNode<E> next;
	
	public DoublyLinkedListNode(E value) {
		this.data = value;	
	}

	public DoublyLinkedListNode() {
		this(null);
	}
	
}

