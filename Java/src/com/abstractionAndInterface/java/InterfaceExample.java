package com.abstractionAndInterface.java;

/*
 * Interface is a blueprint of class, there can be only abstract methods in instance
 * It is used to achieve abstraction and multiple inheritance in Java.
 * Interface can't be instantiated -- can't create an object for instance
 * Interface is used to achieve data abstraction and multiple inheritance
 */
interface printable
{  
	void print();  
}  

class InterfaceExample1 implements printable{  
	public void print()
	{
		System.out.println("Hello");
	}  
}

class InterfaceExample extends InterfaceExample1{
	public static void main(String args[]){  
		InterfaceExample obj = new InterfaceExample();  
		obj.print();  
	}  
}  
