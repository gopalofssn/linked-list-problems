package com.gs.linkedlist.custom.impl.deque;

import java.util.*;

import com.gs.linkedlist.node.DoublyLinkedListNode;
/**
 * 
 * <p>Expected Runtime for any operation : O(1)
 * 
 * @author Gopal Selvaraj
 *
 * 
 */
public class FastestDeque<E> implements Deque<E>{

	private DoublyLinkedListNode<E> first;
	private DoublyLinkedListNode<E> last;
	private Map<Integer, DoublyLinkedListNode<E>> hashCodeElementMap;
	
	public FastestDeque(){
		this.first = new DoublyLinkedListNode<E>();
		this.last = new DoublyLinkedListNode<E>();
		first.next = last;
		last.prev = first;
		this.hashCodeElementMap = new HashMap<Integer, DoublyLinkedListNode<E>>();
	}
	
	public boolean isEmpty() {
		return (hashCodeElementMap.size() == 0 );
	}

	/**
	 * Always added at last
	 */
	public boolean offer(E e) {
		DoublyLinkedListNode<E> node = new DoublyLinkedListNode<E>(e);
	    // link to left element
		node.prev = last.prev;
	    last.prev.next = node;
	    // link to last
	    node.next = last;
	    last.prev = node;
	    hashCodeElementMap.put(node.value, node);
		return true;
	}

	public E poll() {
		 if (isEmpty()) {
			 return null;
		 }
		 DoublyLinkedListNode<E> element = first.next;
		 first.next = first.next.next;
		 
		 hashCodeElementMap.remove(element.value);
		 return element.value;
	}
	
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void addFirst(E e) {
		// TODO Auto-generated method stub
		
	}

	public void addLast(E e) {
		// TODO Auto-generated method stub
		
	}

	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}


	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}


	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
 
}
