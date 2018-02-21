package com.listCollection.java;

public class StudentComparator implements Comparable<StudentComparator>{

	String name;
	int age;
	String subject;
	
	public StudentComparator(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

/*
  	public int compareTo(T o);
  	T stands for Type
	O is the object to be compared
	
	sort method from collections  class internally uses compareTo
	
	
	Few Objects are comparable - Like String, integer - so can be sorted
	Few Objects are not comparable
 */
	
	public int compareTo(StudentComparator SC) {
		
		if(this.age > SC.age) {
			return 1;
		}else if(this.age < SC.age) {
			return -1;
		}
		return 0;
	}


}
