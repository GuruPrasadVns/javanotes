package com.learning.ds.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void basicLinkedListTest() {
		LinkedList list = new LinkedList();
		
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		
		list.insertAtBeg(5);
		
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		
		list.insertAtBeg(4);
		list.insertAtBeg(3);
		list.insertAtBeg(2);
		list.insertAtBeg(1);
		
		assertFalse(list.isEmpty());
		assertEquals(5, list.size());
	}
	
	@Test
	public void hasCycleTest() {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = list.head;
		
		assertTrue(!list.hasCycle());
	}
}
