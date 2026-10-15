package com.core.java8;

public class Student {
   private String Name;
   private int age;
   
   public Student(String name, int age) {
	super();
	Name = name;
	this.age = age;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [Name=" + Name + ", age=" + age + "]";
}

   
   
   
   
} 
