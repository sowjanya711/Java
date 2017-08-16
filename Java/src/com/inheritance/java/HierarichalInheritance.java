package com.inheritance.java;

class Animals1{
	void Eats(){
		System.out.println("Animals are Eating");
	}
}

class Dogs1 extends Animals1 {
	void Barks(){
		System.out.println("Dogs are Barking");
	}
}

class BabyDog1 extends Animals1{
	void puppy(){
		System.out.println("Puppies are cute");
	}
}

class HierarichalInheritance {
	public static void main(String args[]){
		
		Dogs1 d = new Dogs1();
		BabyDog1 bd = new BabyDog1();
		
		d.Eats();
		d.Barks();
		
		bd.Eats();
		bd.puppy();
	}
}
