package com.inheritance.java;

class Animals{
	void Eats(){
		System.out.println("Animals are Eating");
	}
}

class Dogs extends Animals {
	void Barks(){
		System.out.println("Dogs are Barking");
	}
}

class BabyDog extends Dogs{
	void puppy(){
		System.out.println("Puppies are cute");
	}
}

class MultilevelInheritance {
	public static void main(String args[]){
		
		BabyDog bd =new BabyDog ();
		
		bd.Eats();
		bd.Barks();
		bd.puppy();
	}
}
