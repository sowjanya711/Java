package com.polymorphism.java;
/*
 * The ability of an object to take many forms is known as Polymorphism.
 * It can be achieved by method overloading and method over riding
 */

/*
 * Method Overloading : Two or more methods having same name but different parameters
 * By changing number of arguments
 * By changing the data type
 */

class Addition{
	int add(int a, int b){
		int c = a + b;
		return c;
	}
	
	int add(int a, int b, int c){
		int d = a + b+ c;
		return d;
	}
}
 class MethodOverloading {
	public static void main (String args[]){
		Addition a = new Addition();
		System.out.println(a.add(2,2));
		System.out.println(a.add(2,2,2));
	}
}
