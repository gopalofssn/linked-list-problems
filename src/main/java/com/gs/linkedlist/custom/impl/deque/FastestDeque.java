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
	private Map<E, DoublyLinkedListNode<E>> hashCodeElementMap;
	
	public FastestDeque(){
		this.hashCodeElementMap = new HashMap<E, DoublyLinkedListNode<E>>();
	}
	
	public boolean isEmpty() {
		return (hashCodeElementMap.size() == 0 );
	}

	public boolean offer(E e) {
	    return offerLast(e);
	}

	public boolean offerFirst(E e) {
	    return addToDeque(e, false);
	}

	public boolean offerLast(E e) {
		return addToDeque(e, true);
	}
	
	public void addFirst(E e) {
		addToDeque(e, false);
		
	}

	public void addLast(E e) {
		addToDeque(e, true);		
	}
	
	private boolean addToDeque(E e, boolean hasToAddLast) {
		
		if( e == null) throw new NullPointerException();
		
		if (hashCodeElementMap.containsKey(e)) return false;	
		
		DoublyLinkedListNode<E> node = new DoublyLinkedListNode<E>(e);
		
		if (isEmpty()) {
			first = node;
	    	last = node; 
		} else if (hasToAddLast) {
			addToEnd(node);
		} else  {
			addToFirst(node);		
		}
		
		hashCodeElementMap.put(e, node);
		return true;
	}
	

	private void addToEnd(DoublyLinkedListNode<E> node) {		 
		last.next = node;
		node.prev = last;		
		last = node;
	}

	private void addToFirst(DoublyLinkedListNode<E> node) {
		node.next = first;
		first.prev = node;
		first = node;
	}
	
	
	public E removeFirst() {
		return poll();
	}

	public E pollFirst() {
		return poll();
	}

	public E getFirst() {
		 if (isEmpty()) return null;
		 else return first.data;
	}
	
	public E poll() {
		 if (isEmpty()) {
			 return null;
		 }
		 
		 DoublyLinkedListNode<E> element = first;
		 hashCodeElementMap.remove(element.data);
		 
		 if (isEmpty()) {
			 first = null;
			 last = null;
		 }else {
			 first = element.next;
			 first.prev = null;
		 }
		 
		 return element.data;
	}
	
	
	public E removeLast() {
		// TODO Auto-generated method stub
		return pollLast();
	}
	
	public E getLast() {
		if ( isEmpty() ) return null;
		else return last.data;
	}

	
	public E pollLast() {
		 if ( isEmpty() ) return null;
		 
		 DoublyLinkedListNode<E> element = last;
		 hashCodeElementMap.remove(element.data);
		 
		 if ( isEmpty()) {
			 first = null;
			 last = null;
		 }else {
			last = last.prev;
			last.next = null;
		 }
		 
		 return element.data;
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


	


	public E peekFirst() {
		// TODO Auto-generated method stub
		return getFirst() ;
	}

	public E peekLast() {
		// TODO Auto-generated method stub
		return getLast();
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
