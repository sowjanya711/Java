package com.stringbuffer.java;

/*
 * The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
 */

public class StringBufferMethodDelete {
	public static void main (String args[]){ 
		StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
	}  
}