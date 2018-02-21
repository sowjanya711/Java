package com.listCollection.java;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

public static void main(String args[]) {
		
		ArrayList<StudentComparator> al = new ArrayList<StudentComparator>();
		
		al.add(new StudentComparator("Sowjanya", 22, "English"));
		al.add(new StudentComparator("Prasad", 28, "Math"));
		al.add(new StudentComparator("Pranay", 20, "Math"));
		
		Collections.sort(al);
		
		for (StudentComparator str : al) {
			System.out.println("Student Name ::: " + str.getName());
			System.out.println("Student Age ::: " + str.getAge());
			System.out.println("Student Subject ::: " + str.getSubject());
			System.out.println();
		}			
	}
	
}
