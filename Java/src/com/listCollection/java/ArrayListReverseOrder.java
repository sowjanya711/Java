package com.listCollection.java;

import java.util.*;

public class ArrayListReverseOrder {

	public static void main (String args[]) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sowjanya");
		al.add("Pranay");
		al.add("Amma");
		al.add("Prasad");
		
		Collections.sort(al);
		
		System.out.println("Actual Order :::");
		
		for(String str : al) {
			System.out.println(str);
		}
		
		System.out.println("\nReverse Order :::");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(String str : al) {
			System.out.println(str);
		}
	}
}
