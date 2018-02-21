package com.listCollection.java;

import java.util.*;

public class ArrayListMethods {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Elements in ArrayList before adding ::: " +al);
		System.out.println("Size of ArrayList  ::: " +al.size() +"\n");
		
		/* Adding elements to ArrayList*/
		
		al.add("Sowjanya");
		al.add("Prasad");
		al.add("Amma");
		al.add("Pranay");
		
		System.out.println("Elements in ArrayList after adding ::: " +al);
		System.out.println("Size of ArrayList after adding ::: " +al.size() +"\n");

		/* Adding element at particular index */
		
		al.add(1,"Nannagaru");
		
		System.out.println("Elements in ArrayList after adding at particular index ::: " +al);
		System.out.println("Size of ArrayList after adding at particular index ::: " +al.size() +"\n");
		
		/* Updating elements in ArrayList*/
		
		al.set(1, "Shankara Rao");
		
		System.out.println("Elements in ArrayList after updating element at particular index ::: " +al);
		System.out.println("Size of ArrayList after updating element at particular index ::: " +al.size() +"\n");
		
		/* Removing elements from ArrayList*/
		
		al.remove(3);

		System.out.println("Elements in ArrayList after removing ::: " +al);
		System.out.println("Size of ArrayList after removing ::: " +al.size() +"\n");
		
		/* Get the index of given element */
		
		int position = al.indexOf("Prasad");
		
		System.out.println("Index of element Prasad in the current Array List ::: " +position +"\n");
		
		/* Get the element at given index */
		
		String elem = al.get(0);
		
		System.out.println("Element at index 0 in the current Array List ::: " +elem +"\n");
		
		/* Copying elements from one Array List to other Array List */
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.addAll(al);
		System.out.println("Elements in ArrayList after copying from Array List 1 ::: " +al2);
		
		/*Checking existence of an element*/
		
		if(al2.contains("Sowjanya")){
			System.out.println("\nArray List2 contains element Sowjanya");
		}else {
			System.out.println("\nArray List2 doesn\'t contain element Sowjanya");
		}	
		
	}

}
