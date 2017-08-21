package com.abstractionAndInterface.java;

/*
 * Interface is like Menu, Class is like Menu with Recipe Details
 * In interface you declare methods but implementation of the method should be done in the class 
   that implements this interface
 * Each class can implement the method of the interface in its own way
   i.e the recipe (implementation)of the menu (method) can be different for each Restaurant (class)
 * Variables can be declared inside an interface but they are implicitly "final" and "static", 
    meaning they cannot be changed by the implementing class.
 * The variables must also be initialized with a constant value. i.e value should be assigned.
 */
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
