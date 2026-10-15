package com.core.java8;

import java.util.ArrayList;
import java.util.Collections;

public class StatcMethodRefStudentTest {
   
	public static int CompateByName(Student a,Student b) {
		 
		return a.getName().compareTo(b.getName());
	}
	
	public static void main(String[] args) {
		
		
		   
	  ArrayList<Student> al=new ArrayList<>();
		al.add(new Student("rr", 29));
		al.add(new Student("tt", 29));
		al.add(new Student("ee", 29));
		al.add(new Student("dd", 29));
		al.add(new Student("AA", 29));

		Collections.sort(al,StatcMethodRefStudentTest::CompateByName);
		
		al.forEach(System.out::println);
	}
	
}
