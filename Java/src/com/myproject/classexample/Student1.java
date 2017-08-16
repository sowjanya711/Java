package com.myproject.classexample;

class Students {
	int id;
	String name;
	
	void insertRecord(int studentId, String studentName){
		id = studentId ;
		name = studentName ;
	}
	
	void display(){
		System.out.println("Student Details ::: " + id +" "+ name);
	}
}


public class Student1 {
	public static void main(String args[]){
		
		Students s1 = new Students ();
		Students s2 = new Students ();
		
		s1.insertRecord(101, "Sowjanya");
		s2.insertRecord(102, "Satya");
		
		s1.display();
		s2.display();
		
	}
}
