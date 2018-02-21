package com.listCollection.java;

public class StudentComparator2 implements Comparable<StudentComparator2>{
	
	int id;
	String name;
	int price;
	
	public StudentComparator2(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int compareTo(StudentComparator2 SC2) {
		if(this.price < SC2.price) {
			return 1 ;
		} 
		else if(this.price > SC2.price) {
			return -1;
		}
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
