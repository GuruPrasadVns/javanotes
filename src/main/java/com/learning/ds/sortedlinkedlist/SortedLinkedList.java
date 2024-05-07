package com.learning.ds.sortedlinkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SortedLinkedList {
	
	Node head;
	
	public SortedLinkedList() {
		this.head = null;
	}
	
	public void insert(int item) {
		Node node = new Node(item);
		
		if(head == null) {
			head = node;
			return;			
		}
		
		if(head.data >= item) {
			node.next = head;
			head = node;
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		while(temp != null && temp.data <= item) {
			prev = temp;
			temp = temp.next;
		}
		
		node.next = prev.next;
		prev.next = node;
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void print() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
		System.out.println("NULL");
	}
	
	public int size() {
		Node temp = head;
		int size = 0;
		
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		
		return size;
	}
	
	
	public void removeDuplicates() {
		Node curr = head;
		
		while(curr != null) {
			Node temp = curr;
			
			while(temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			
			curr.next = temp;
			curr = curr.next;
		}
	}
	
	public void removeDuplicatesRecursively(Node head) {
		Node toFree  = null;
		
		
		if(head == null)
			return;
		
		if(head.next != null) {
			if(head.data == head.next.data) {
				toFree = head.next;
				head.next = head.next.next;
				removeDuplicatesRecursively(head);
			}else {
				removeDuplicatesRecursively(head.next);
			}
		}
	}
	
	public void removeDuplicatesRecursively() {
		removeDuplicatesRecursively(head);
	}
}
