package com.learning.ds.sortedlinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedLinkedListTest {
	
	@Test
	public void buildSimpleListTest() {
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(5);
		sortedLinkedList.insert(26);
		sortedLinkedList.print();
		
		assertEquals(16, sortedLinkedList.size());
	}
	
	@Test
	public void removeDuplicates() {
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(5);
		sortedLinkedList.insert(26);
		sortedLinkedList.print();
		
		assertEquals(16, sortedLinkedList.size());
		
		sortedLinkedList.removeDuplicates();
		sortedLinkedList.removeDuplicates();
		sortedLinkedList.removeDuplicates();
		
		sortedLinkedList.print();
		
		assertEquals(6, sortedLinkedList.size());
	}
	
	@Test
	public void removeDuplicatesRecursively() {
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(23);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(11);
		sortedLinkedList.insert(27);
		sortedLinkedList.insert(25);
		sortedLinkedList.insert(27);
		
		sortedLinkedList.insert(5);
		sortedLinkedList.insert(26);
		sortedLinkedList.print();
		
		assertEquals(16, sortedLinkedList.size());
		
		sortedLinkedList.removeDuplicatesRecursively();
		sortedLinkedList.removeDuplicatesRecursively();
		sortedLinkedList.removeDuplicatesRecursively();
		
		sortedLinkedList.print();
		
		assertEquals(6, sortedLinkedList.size());
	}
}
