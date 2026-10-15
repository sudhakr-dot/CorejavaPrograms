package com.Stream.Basic;

public class Employee01 {
   
	private int empid;
	private String empname;
	private String city;
	private double salary;
	private String department;
	
	public Employee01(int empid, String empname, String city, double salary, String department) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.city = city;
		this.salary = salary;
		this.department = department;
	}

	public Employee01() {
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee01 [empid=" + empid + ", empname=" + empname + ", city=" + city + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	 
} 
