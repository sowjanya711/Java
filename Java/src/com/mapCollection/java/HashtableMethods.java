package com.mapCollection.java;

import java.util.*;

public class HashtableMethods {

	public static void main (String args[]) {
		
		Enumeration<Integer> htablekeys ;
		Integer key;
		String value;
		
		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
		
		/* Adding elements to Hashtable */
		
		htable.put(12, "C");
		htable.put(2, "Java");
		htable.put(7, "Excel");
		htable.put(49,"Selenium");
		htable.put(3, "Protractor");
		htable.put(13, "Protractor");
		
		/* Get size of Hashtable */
		System.out.println("Size of the hashtable ::: " +htable.size());
		
		/*Iterating through the entries of hashtable */
		System.out.println("\nEntries in the Hashtable ::: ");
		
		//Get enumeration of keys so that we can iterate through the keys
		htablekeys = htable.keys();
		
		while(htablekeys.hasMoreElements()) {
			key = htablekeys.nextElement();
			value = htable.get(key);
			System.out.println("Key: " +key+ " & Value: " +value);
		}	
		
		//Check key and value existence
		
		boolean keyExists = htable.containsKey(12) ;
		System.out.println("\nHashtable contains key 12 ? " +keyExists);
		
		boolean valueExists = htable.containsValue("Sowjanya");
		System.out.println("\nHashtable contains value Sowjanya ? "+valueExists);
		
			
	}
}
