package com.listCollection.java;

import java.util.*;

public class ArrayListIteration {

	public static void main (String args[]) {
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("India");
		al.add("USA");
		al.add("Qatar");
		al.add("UK");
		al.add("UAE");
		
		System.out.println("\nUsing For Loop");
		
		for (int i =0; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("\nUsing Advanced For Loop");
		
		for (String i : al) {
			System.out.println(i);
		}
		
		System.out.println("\nUsing While Loop");
		
		int i = 0;
		
		while(i < al.size()) {
			System.out.println(al.get(i));
			i++;
		}
		
		System.out.println("\nUsing Iterator");
				
		Iterator<String> iter = al.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next() );
		}
	}
}
