import java.util.*;
/**
 * 
 * @author Siva Kanth
 *
 */
// Java program to find middle of linked list 
class MidOfLinkedList 
{ 
	Node head; // head of linked list 

	/* Linked list node */
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to print middle of linked list */
	void printMiddle() 
	{ 
		Node slow_ptr = head; 
		Node fast_ptr = head; 
		if (head != null) 
		{ 
			while (fast_ptr != null && fast_ptr.next != null) 
			{ 
				fast_ptr = fast_ptr.next.next; 
				slow_ptr = slow_ptr.next; 
			} 
			System.out.println(slow_ptr.data); 
		} 
	} 

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	public static void main(String [] args) 
	{ 
		MidOfLinkedList llist = new MidOfLinkedList(); 
		for (int i=0; i<6; i++) 
		{ 
			llist.push(i); 
			llist.printMiddle(); 
		} 
	} 
} 

