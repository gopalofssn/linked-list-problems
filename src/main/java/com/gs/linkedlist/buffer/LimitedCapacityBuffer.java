package com.gs.linkedlist.buffer;

import com.gs.linkedlist.node.Node;

/**
 * 
 * @author Gopal Selvaraj 
 * buffer only can hold capacity
 */

public class LimitedCapacityBuffer<T> {

	private final int capacity;
	private int currentCapacity;
	private Node<T> head;
	private Node<T> tail;

	public LimitedCapacityBuffer(int capacity) {
		this.capacity = capacity;
		head = tail;
	}

	public int write(T[] chars) {
		if (currentCapacity == capacity) {
			return 0;
		}

		int index = 0;
		while (currentCapacity < capacity && index < chars.length) {
			addToBuffer(chars[index]);
			index++;
		}

		return index;
	}

	@SuppressWarnings("unchecked")
	public T[] read(int n) {
		if (currentCapacity == 0) {
			return (T[]) new Object[0];
		}
		int max = Math.min(currentCapacity, n);
		T[] result = (T[]) new Object[max];
		int index = 0;
		while (index < max) {
			result[index] = readFromBuffer();
			index++;
		}

		return result;
	}

	private T readFromBuffer() {
		currentCapacity--;
		T data = head.data;
		head = head.next;
		return data;
	}

	private void addToBuffer(T data) {
		currentCapacity++;
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = head;
			return;
		}
		tail.next = node;
		tail = tail.next;
	}

}
