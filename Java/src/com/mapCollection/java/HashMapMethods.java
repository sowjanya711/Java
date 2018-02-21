package com.mapCollection.java;

import java.util.*;

public class HashMapMethods {

	public static void main(String args[]) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String> ();
		
		/* Adding elements to HashMap */
		
		hmap.put(12, "C");
		hmap.put(2, "Java");
		hmap.put(7, "Excel");
		hmap.put(49,"Selenium");
		hmap.put(3, "Protractor");
		hmap.put(13, "Protractor");
		
		System.out.println("Key and Values stored in HashMap ::: \n" +hmap);
		
		/*Get Values based on key */
		
		System.out.println("\nValue for the Key 49 ::: " +hmap.get(49));
		System.out.println("Value for the Key 0 which is not there in HashMap ::: " +hmap.get(0));
		
		/* Remove Values based on key */
		System.out.println("\nRemoving Key 12 in HashMap ::: " +hmap.remove(12));
		System.out.println("Key and Values stored in HashMap :::" +hmap);
		
		/* To check if HashMap is empty */
		
		System.out.println("\nIs HashMap Empty ? " +hmap.isEmpty() );
		
		/*Check if particular key exists in HashMap*/
		
		boolean keyExists = hmap.containsKey(49);
		System.out.println("\nKey 49 exists in HashMap ? " +keyExists);
		
		/*Check if particular value exists in HashMap*/
		
		boolean valueExists = hmap.containsValue("Angular");
		System.out.println("Value Angular exists in HashMap ? " +keyExists);
	}
}
