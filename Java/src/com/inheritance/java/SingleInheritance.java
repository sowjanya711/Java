package com.inheritance.java;

class Animal {
	void Eat(){
		System.out.println("Animal is Eating ...");
	}
}

class Dog extends Animal {
	void Bark(){
		System.out.println("Dog is Barking ...");
	}
}

class SingleInheritance {
	public static void main(String args[]){
		
		Dog d = new Dog();
		
		d.Eat();
		d.Bark();
	}
}
