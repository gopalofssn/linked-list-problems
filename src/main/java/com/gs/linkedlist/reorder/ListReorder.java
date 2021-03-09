package com.gs.linkedlist.reorder;

import com.gs.linkedlist.common.ReverseList;
import com.gs.linkedlist.node.Node;

/**
 * 
 * @author Gopal Selvaraj
 * input  : 1 2 3 4 5 6
 * output : 1 6 2 5 3 4
 * 
 * approach
 *  split as 2 list
 *  reverse 2nd half 
 *  merge list
 */
public class ListReorder {

  public Node<Integer> reorder(Node<Integer> head) {
    
    if(head == null || head.next == null) {
      return head;
    }
    
    Node<Integer>[] halves = split(head); // [1 2 3]  & [4 5 6]

    Node<Integer> reverse = new ReverseList<Integer>().reverse(halves[1]); // 6 5 4

    mergeList(halves[0], reverse);
    
    return head;
  }

  private void mergeList(Node<Integer> main, Node<Integer> secondHalf) {
    
    while(secondHalf != null) {
      Node<Integer> mainNext = main.next;
      Node<Integer> secondHalfNext = secondHalf.next;
      
      main.next = secondHalf;
      secondHalf.next = mainNext;
      
      main = mainNext;
      secondHalf = secondHalfNext;
    }
    
  }

  private Node<Integer>[] split(Node<Integer> head) {
    
    Node<Integer> slow = head;
    Node<Integer> fast = head;
    
    while(fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    Node<Integer>  secondHalf = slow.next; // SHOULD MOVE TO NEXT POINT TO GET MID
    slow.next = null; // to split first half;
    
    return new Node[]{head, secondHalf};
  }
  
}
