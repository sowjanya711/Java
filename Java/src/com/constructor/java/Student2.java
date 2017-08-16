package com.constructor.java;

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
