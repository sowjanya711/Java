package com.mapCollection.java;

import java.util.*;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String args[]) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String> ();

		hmap.put(12, "C");
		hmap.put(2, "Java");
		hmap.put(7, "Excel");
		hmap.put(49,"Selenium");
		hmap.put(3, "Protractor");
		
		Set<Entry<Integer, String>> entries = hmap.entrySet();
		
		System.out.println("Advanced for Loop");
		
		for (Map.Entry<Integer, String> entry : entries) {
			int key = entry.getKey() ;
			String value = entry.getValue();
			System.out.println("Key : " + key + " Value : " + value);
		}
		
		System.out.println("\nIterator");

		Iterator<Entry<Integer, String>> iter = entries.iterator();
		
		while(iter.hasNext()) {
			Map.Entry en = (Map.Entry)iter.next();
			
			System.out.println(en.getKey() + " ::: " +en.getValue());
		}
	}
	
}
