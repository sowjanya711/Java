package com.constructor.java;


 class Example {
	
	Example() {
		 System.out.println("Exmaple Consturtor is Created");
	}
	
	public static void main (String args[]){
		Example e = new Example();	
		
		// e.Example();   --> This is not needed, because constructor is called immediately when the object is created
	}
}
  