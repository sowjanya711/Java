package com.polymorphism.java;

/*
  Let's say there are 2 classes. When a method in child class has the same method name and type signature
  as method in its super class, then the method in the sub class is said to be override the method in the 
  super class
 */

class Bank{
	int rateOfInterest(){
		return 0;
	}
}

class ICICI extends Bank {
	int rateOfInterest(){
		return 8;
	}
}

class BOA extends Bank {
	int rateOfInterest(){
		return 10;
	}
}

class capitalOne extends Bank {
	int rateOfInterest(){
		return 12;
	}
}

public class MethodOverRiding {
 public static void main (String args[]){
		
	 ICICI i = new ICICI ();
	 BOA boa = new BOA();
	 capitalOne co = new capitalOne();
	 
	 System.out.println("ICICI Bank Rate of Interest 		::: "+i.rateOfInterest());
	 System.out.println("BOA Rate of Interest 		::: "+boa.rateOfInterest());
	 System.out.println("Capital One Bank Rate of Interest	::: "+co.rateOfInterest());
 }
}
