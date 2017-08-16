package com.abstractionAndInterface.java;

/*
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * Ways to achieve:
 * 1. Abstract Class
 * 2. Interface
 */

/*
 * A class that is declared as Abstract is an abstract class
 * A method that is declared as abstract and does not have implementation is known as abstract method.
 * Class needs to be extended and its method needs to be implemented.
 * It cannot be instantiated -- cannot create object for the abstract class.
 */

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape {
	void draw(){
		System.out.println("Drawing Rectangle");
	}
}

class Square extends Shape {
	void draw(){
		System.out.println("Drawing Square");
	}
}
public class AbstractExample {
	public static void main (String args[]){
		Shape r = new Rectangle ();
		Shape s = new Square ();

		r.draw();
		s.draw();

	}
}
