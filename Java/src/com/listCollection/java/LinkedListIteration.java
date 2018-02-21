package com.listCollection.java;

import java.util.*;

public class LinkedListIteration {

	public static void main (String args[]) {

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("C");
		ll.add("Angular");
		ll.add("SQL");
		ll.add("Selenium");
		ll.add("Excel");

		System.out.println("For Loop :::");
		
		for(int i =0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("\nAdvanced For Loop :::");
		
		for (String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("\nWhile Loop :::");
		
		int counter =0;
		while (counter < ll.size()) {
			System.out.println(ll.get(counter));
			counter++;
		}
		
		System.out.println("\nIterator :::");
		
		Iterator<String> iter = ll.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
