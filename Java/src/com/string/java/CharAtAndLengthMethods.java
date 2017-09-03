package com.string.java;

/*
 * Returns char value at a given index
 */

public class CharAtAndLengthMethods {
	public static void main (String args[]){
		String s = "Corporate";
		
//		System.out.println("Value at index 0 is ::: " +s.charAt(0));
//		System.out.println("Value at index 2 is ::: " +s.charAt(2));
//		System.out.println("Value at index 5 is ::: " +s.charAt(5));
//		System.out.println("Value at index 8 is ::: " +s.charAt(8));
		
		for (int i=0; i< s.length(); i++){
			System.out.println("Value at index "+i+ " is ::: " +s.charAt(i));
		}
	}
}
