package com.abstractionAndInterface.java;

abstract class printable2
{  
	abstract void print();  
}  

class InterfaceExample2 extends printable2{  
	public void print()
	{
		System.out.println("Hello");
	}  
}

class InterfaceExample3 extends InterfaceExample2{
	public static void main(String args[]){  
		InterfaceExample obj = new InterfaceExample();  
		obj.print();  
	}  
}  
