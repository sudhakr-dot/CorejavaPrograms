package com.Streams;


public class Student {
  
	private int id;
	private String name;
	private String dept;
	private char gender;
	private int age;
	
	public Student(int id, String name, String dept, char gender,int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.gender = gender;
		this.age=age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
	
	}
