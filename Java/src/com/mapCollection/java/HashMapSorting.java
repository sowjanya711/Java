package com.mapCollection.java;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSorting {
	
	public static void main (String args[]) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String> ();

		hmap.put(12, "C");
		hmap.put(2, "Java");
		hmap.put(7, "Excel");
		hmap.put(49,"Selenium");
		hmap.put(3, "Protractor");
		
		System.out.println("Before Sorting ::: ");
		
		Set<Entry<Integer, String>> entries = hmap.entrySet();
		
		Iterator<Entry<Integer, String>> iter = entries.iterator();
		
		while(iter.hasNext()) {
			Map.Entry en =  (Map.Entry) iter.next();
			
			System.out.println(en.getKey() + " ::: " +en.getValue());
		}
		
		System.out.println("\nSorting by Keys ::: ");
		
		Map<Integer, String> tmap = new TreeMap<Integer, String> (hmap);
		
		Set<Entry<Integer, String>> entries1 = tmap.entrySet();
	
		Iterator<Entry<Integer, String>> iter1 = entries1.iterator();
		
		while(iter1.hasNext()) {
			Map.Entry en1 =  (Map.Entry) iter1.next();
			
			System.out.println(en1.getKey() + " ::: " +en1.getValue());
		}
		
	}
}
