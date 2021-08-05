package com.gs.linkedlist.custom.impl.deque;

import static org.junit.Assert.*;

import org.junit.Test;

public class FastestDequeTest {

	@Test
	public void testEmptyOfferPoll() {
		FastestDeque<Integer> deque = new FastestDeque<Integer>();
		assertTrue(deque.isEmpty());
		assertTrue(deque.offer(1));
		assertFalse(deque.offer(1));
		assertFalse(deque.isEmpty());
		assertEquals(deque.poll().toString(), "1");
		assertTrue(deque.isEmpty());
	}
	
	@Test
	public void testOfferPoll() {

		FastestDeque<Integer> deque = new FastestDeque<Integer>();
		assertTrue(deque.offer(1));
		assertTrue(deque.offer(2));
		assertFalse(deque.isEmpty());
		assertEquals(deque.poll().toString(), "1");
		assertEquals(deque.poll().toString(), "2");
		assertTrue(deque.isEmpty());

		assertTrue(deque.offer(3));
		assertFalse(deque.isEmpty());
		assertEquals(deque.poll().toString(), "3");
		assertTrue(deque.isEmpty());
	}
}
