package com.stringbuffer.java;

//The insert() method inserts the given string with this string at the given position.

public class StringBufferMethodInsert {
	public static void main (String args[]){
		StringBuffer sb = new StringBuffer ("Hello");
		
		sb.insert(1,"Java");
		System.out.println(sb);
	}
	
}
