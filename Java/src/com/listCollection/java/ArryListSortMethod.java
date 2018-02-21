package com.listCollection.java;

import java.util.*;

public class ArryListSortMethod {

	public static void main (String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(11);
		
		al.add(1);
		
		al.add(33);
		
		al.add(22);
		
		System.out.println("Before Sorting");
		
		Iterator<Integer> iter = al.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\nAfter sorting Using Collections.sort() method");
		
		Collections.sort(al);
		
		Iterator<Integer> counter = al.iterator();
		
		while(counter.hasNext()) {
			System.out.println(counter.next());
		}
	}
}
