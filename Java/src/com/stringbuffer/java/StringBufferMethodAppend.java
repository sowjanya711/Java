package com.stringbuffer.java;

/*
 * mutable = modifiable, immutable = cannot modifiable
 * Java string is immutable but java stringBuffer and stringBuilder are used for creating mutable strings
 * 
 * stringBuffer Constructors
 * -------------------------
 * stringBuffer()  --> Creates empty string buffer with initial capacity of 16
 * stringBuffer(int capacity) --> Creates empty string buffer with specified capacity as length
 * stringBuffer(String str) --> Creates a string buffer with specified string
 * 
 * There are different StringBuffer Methods
 */


 class StringBufferMethodAppend {
	public static void main (String args[]){
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append(" Java");
		System.out.println(sb);
		
	}
}
