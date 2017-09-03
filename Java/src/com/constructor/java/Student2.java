package com.constructor.java;

/*
 * Constructor is a special type of method , it is invoked at the time of creation of object.
 * Rules:
 * 1. Constructor name must be the same name as its class name
 * 2. Constructor must not have explicit return type
 */

public class Student2 {

	int id;
	String name;
	
	Student2(int num, String StudentName){
		id = num;
		name = StudentName;
		System.out.println(id + " "+name);
	}

 public static void main (String args[]){
	Student2 s = new Student2(1,"Sowjanya");
}
}
