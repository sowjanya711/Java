package com.mapCollection.java;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashtableSorting {
	public static void main (String args[]) {

		Enumeration<Integer> htablekeys ;
		Integer key;
		String value;

		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();

		htable.put(12, "C");
		htable.put(2, "Java");
		htable.put(7, "Excel");
		htable.put(49,"Selenium");
		htable.put(3, "Protractor");
		htable.put(13, "Protractor");
		
		System.out.println("Before Sorting");
		
		htablekeys = htable.keys();
		
		while(htablekeys.hasMoreElements()) {
			key = htablekeys.nextElement();
			value = htable.get(key);
			System.out.println("Key: " +key+ " & Value: " +value);
		}
		
		System.out.println("\nAfter Sorting");
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(htable);
		
		//Get the set of entries
		
		Set<Entry<Integer, String>> entries = tmap.entrySet();
		
		Iterator<Entry<Integer, String>> iter = entries.iterator();
		
		while(iter.hasNext()) {
			Entry<Integer, String> en = iter.next();
			
			value = en.getValue();
			key = en.getKey();
			System.out.println("Key: " +key+ " & Value: " +value);
		}
		
		
	}
}
