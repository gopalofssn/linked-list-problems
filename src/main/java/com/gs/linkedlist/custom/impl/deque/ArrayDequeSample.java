package com.gs.linkedlist.custom.impl.deque;

import java.util.*;

public class ArrayDequeSample {

	/* [ 1 2 3 3 4 5 0]
	
	*/
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(3);
		deque.offer(null);
		deque.offerLast(5);
		deque.offerFirst(0);
		
		System.out.println(deque);
		System.out.println(deque.peek()); // 1
		System.out.println(deque.peekLast()); // 3
		System.out.println(deque.peekFirst()); // 1
		
		System.out.println(deque.pop()); // 1
		System.out.println(deque.poll()); // 1

	}

}
