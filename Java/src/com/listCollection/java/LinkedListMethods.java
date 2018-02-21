package com.listCollection.java;

import java.util.*;

public class LinkedListMethods {

	public static void main (String args[]) {

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("C");
		ll.add("Angular");
		ll.add("SQL");
		
		System.out.println("Linked List Content ::: " +ll);
		
		/*Add First and Last Elements*/
		
		ll.addFirst("Excel");
		ll.addLast("Power Point");

		System.out.println("Linked List Content after adding first and last elements ::: " +ll);
		
		/*Get and Set LinkedList Values*/
		
		System.out.println("Element at index 0 ::: " +ll.get(0));
		
		ll.set(0, "Selenium");
		System.out.println("Element at index 0 after setting new value ::: " +ll.get(0));
		
		System.out.println("Current Linked List Content ::: " +ll);
		
		/* Remover First and Last Values */
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Linked List Content after removing first and last elements ::: " +ll);
		
		
		/* Getting first and last elements in Linked List*/
		
		System.out.println("First element ::: " + ll.getFirst());
		System.out.println("Last element ::: " +ll.getLast());
		
	}
}
