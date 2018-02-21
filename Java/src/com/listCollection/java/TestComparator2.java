package com.listCollection.java;

import java.util.*;

public class TestComparator2 {

	public static void main (String args[]) {
		
		ArrayList<StudentComparator2> al = new ArrayList<StudentComparator2>();
		
		al.add(new StudentComparator2(102, "Iphone", 1000));
		al.add(new StudentComparator2(101, "Samsung", 900));
		al.add(new StudentComparator2(104, "Motorolla", 700));
		al.add(new StudentComparator2(103, "HTC", 800));
		
		Collections.sort(al);
		
		for(StudentComparator2 str : al ) {
			System.out.println("Student Name ::: " + str.getId());
			System.out.println("Student Age ::: " + str.getName());
			System.out.println("Student Subject ::: " + str.getPrice());
			System.out.println();
			
		}
	}
}
