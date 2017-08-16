package com.myproject.classexample;
/*
 * Class is a template using which we can create an object
 * 
 * Object is an instance of class. Object has state and behavior
 * We create an object for a class. 
 * Object NAME should be CLASS NAME for which you want to create an object
 * 
 * class animal{
 * 
 *  int number ;
 *  String name;
 * 	animal a = new animal();
 * 
 * 	a.id = 1;
 *  a.name = "Dog";
 * } 
 *
 */
 
class Student {		
	int id;
	String name;
}

 class School {
	
	 public static void main (String args[]){
		 
		 // Creating object for class Student
		 // Object syntax : ClassName reference-variable = new className()
		 Student s1 = new Student(); 
		 Student s2 = new Student();
		 
		 s1.id = 101;
		 s1.name = "Sowjanya";
		 
		 s2.id = 102;
		 s2.name = "Satya";
		 
		 System.out.println("Student1 id :: " + s1.id + " name :: " + s1.name);
		 System.out.println("Student2 id :: " + s2.id + " name :: " + s2.name);
	 }
}
