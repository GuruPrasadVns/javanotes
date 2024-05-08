package com.learning.ds.linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtBeg(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
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
	
	public void print() {
		Node temp = head;
		
		
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		System.out.print("NULL");
	}
	
	public boolean hasCycle() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		
		return false;
	}
}
