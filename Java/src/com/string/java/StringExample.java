/*
 * In java, string is an object that represents a sequence of characters.
 * Java string is immutable, i.e. it cannot be changed
 * Two ways of creating string object
 * 1. By string literal e.g: String s = "Welcome"
 * 2. By new keyword    e.g: String s = new String ("Welcome")
 */

package com.string.java;

class welcome {
	
	String s1 = "Java";					//Creating string by java string literal
	
	String s2 = new String ("Hello"); 	//Creating java string by new keyword
	
	char a[] = {'s','o','w','j','i'};   
	String s3 = new String (a);			//Converting char array to string

}

public class StringExample {
	public static void main(String args[]){
		welcome w = new welcome();
		
		System.out.println("Created using String Literal ::: " +w.s1);
		System.out.println("Created using new keyword ::: " +w.s2);
		System.out.println("Converted char array to String ::: " +w.s3);
	}
}
