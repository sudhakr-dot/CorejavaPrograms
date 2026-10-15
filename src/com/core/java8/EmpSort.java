package com.core.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class EmpSort {
    public static void main(String[] args) {
		ArrayList<Employee> empls=new ArrayList<Employee>();
		
		empls.add(new Employee(101,"sai",10.00d));
		empls.add(new Employee(102,"ram",1200023.00d));
		empls.add(new Employee(105,"ravi",3200023.00d));
		empls.add(new Employee(104,"sai",1300023.00d));
		empls.add(new Employee(108,"rew",14500023.00d));

		
		Stream<Employee> sorted = empls.stream().sorted(Comparator.comparing(Employee::getEmpname).thenComparing(Employee::getEmpsalary));
		
		System.out.println(sorted);
		
		
		Collections.sort(empls ,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
			 return o1.getEmpname().compareTo(o2.getEmpname());
			}

			

			
		});
		
		for (Employee employee : empls) {
			System.out.println(employee);
		}

		
		System.out.println("====================After sort Name===========================");
		
		  Collections.sort(empls ,new Comparator<Employee>() {
		  
		  @Override public int compare(Employee o1, Employee o2) {
			  
			  
			  return (int) o1.getEmpid()-o2.getEmpid();
			  }
		  
		  
		  
		  
		  }); for (Employee employee : empls) { System.out.println(employee); }
		 
				
	}
}
