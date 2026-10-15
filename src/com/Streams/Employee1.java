package com.Streams;

import java.util.Comparator;

public class Employee1 implements Comparable<Employee1> {

	private int id;
	private String name;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
		// return this.salary.comparedouble(o.salary);
	}

	static Comparator<Employee1> Namecomparator=new Comparator<Employee1>() {
	  
	  @Override public int compare( Employee1 o1, Employee1 o2) {
		  // TODO Auto-generated method stub 
	  return  (int) ((int) o1.getSalary()-o2.getSalary()); }

	
	  
	  
	  };

	
	 

}
