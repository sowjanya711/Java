package com.inheritance.java;
/*
	Acquiring the properties of a parent class is called inheritance
	class can be inherited using "extends" key word
	Method overriding can be achieved using inheritance
*/

 class Employee {

	 float salary = 40000;
}
 
 class Programmer extends Employee {
	 
	 int bonus = 1000;
	 
	 public static void main (String args[]){		 
		 
		 Programmer p = new Programmer();
		 System.out.println("Salary ::: " +p.salary);
		 System.out.println("Bonus ::: " +p.bonus);
		 
	 }
 }
