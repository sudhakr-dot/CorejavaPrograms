package com.Stream.Basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee01Test {
	
public static void main(String[] args) {
	

	   
	ArrayList<Employee01> employeeList= new ArrayList<>();
	
	employeeList.add(new Employee01(122, "Paul Niksui", "Hyd", 13500.0, "Sales And Marketing"));
	employeeList.add(new Employee01(122, "Martin Theron","Bng",  34500.0, "Product Development"));
	employeeList.add(new Employee01(144, "Murali Gowda",  "Mumbai", 18000.0, "Product Development"));
	employeeList.add(new Employee01(155, "Nima Roy",  "pune", 22700.0,  "HR"));
	employeeList.add(new Employee01(166, "Iqbal Hussain", "chennai", 10500.0,  "java"));
	employeeList.add(new Employee01(177, "Manu Sharma",  "vizag", 27000.0, "Account And Finance"));
	employeeList.add(new Employee01(188, "Wang Liu", "gujarat", 34500.0, "Product Development"));
	employeeList.add(new Employee01(123, "Paul", "Hyd", 13500.0, "java"));
	employeeList.add(new Employee01(135, "Martin","Bng",  18000.0, "Development"));

	
   // Find all employees from a specific city and get the count8ds	  
	long count = employeeList.stream().filter(e->e.getCity().equals("Bng")).count();
	//System.out.println(count);
       
	List<String> nameslist = employeeList.stream().map(e->e.getEmpname().toUpperCase()).sorted().collect(Collectors.toList());
	//System.out.println(nameslist);

	Double collect = employeeList.stream().filter(e->e.getDepartment().equals("java")).collect(Collectors.summingDouble(Employee01::getSalary));

    // System.out.println(collect);
   //7. Get the sum of salaries of all employees and the average salary  
     double sum = employeeList.stream().mapToDouble(Employee01::getSalary).sum();
     
     //System.out.println(sum);
  //Get a Map of Employee Names and their salaries   
     Map<String, Double> map = employeeList.stream().collect(Collectors.toMap(e->e.getEmpname(), e->e.getSalary()));
     
		/*
		 * map.forEach((name,salary)->{ System.out.println(name+" "+salary); });
		 */  
     //Get the employees with the highest salary 
     
     Optional<Double> collect2 = employeeList.stream().sorted(Comparator.comparingDouble(e->((Employee01) e).getSalary()).reversed()).map(e->e.getSalary()).findFirst();
     
    //  System.out.println(collect2);
    Optional<Double> collect3 = employeeList.stream().sorted((emp1,emp2)->((Double)emp1.getSalary()).compareTo(emp2.getSalary()))
    		 .map(e->e.getSalary()).findFirst();
   //  System.out.println(collect3);
         
     //2nd Highest salary
List<Double> sal23 = employeeList.stream().map(e->e.getSalary()).sorted((sal1,sal2)->sal2.compareTo(sal1)).collect(Collectors.toList());
  // System.out.println(sal23);
    
  
   // Get the employees with the highest salary 
   
   Optional<Employee01> maxEmployee = employeeList.stream().max(Comparator.comparingDouble(e->e.getSalary()));
   
  // maxEmployee.ifPresent(System.out::println);
   
 //Get Highest sal
   double maxsalary = employeeList.stream().mapToDouble(emp->emp.getSalary()).skip(1).max().getAsDouble();
   
   List<Employee01> no_ofmaxsalaries = employeeList.stream().filter(e->e.getSalary()==maxsalary).collect(Collectors.toList());
    
  // System.out.println(no_ofmaxsalaries);
   
   
   
   //2nd Highest salary
   double secondhighest= employeeList.stream().map(e->e.getSalary()).sorted((sal1,sal2)->sal2.compareTo(sal1)).skip(1).findFirst().get();
       
   
   List<Employee01> secondhighestsalaryedemployees  = employeeList.stream().filter(e->e.getSalary()==secondhighest).collect(Collectors.toList());
   
   // System.out.println(secondhighestsalaryedemployees);

   /*
	* advanced java questions 
	*
   */
   
    Map<String, List<String>> Listofnames = employeeList.stream().collect(Collectors.groupingBy(Employee01::getDepartment,Collectors.mapping(Employee01::getEmpname,Collectors.toList())));
   
   // System.out.println(Listofnames);
    
   //  Get the sum of salaries of all employees by department
    
 Map<String, Double> sumofsalaries = employeeList.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.summingDouble(emp->emp.getSalary())));
    
   System.out.println(sumofsalaries);
    
   
  Map<String, Map<String, List<Employee01>>> collect4 = employeeList.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.groupingBy(Employee01::getCity)));
    
  
  System.out.println(collect4); 
  
  collect4.forEach((dept ,citys)->{
	 System.out.println(dept);
	 citys.forEach((city,emplist)->{
		 System.out.println(city);
		 emplist.forEach(emp->System.out.println(emp));
	 });
	  
  });
  
  List<Employee01> sortingwithtwoConditions = employeeList.stream().sorted(Comparator.comparing(Employee01::getEmpid).thenComparing(Employee01::getEmpname).thenComparingDouble(emp->emp.getSalary())).collect(Collectors.toList());
  
   System.out.println(sortingwithtwoConditions);
  
    String str="Hello Java 8 Stream";
    
        String string = str.chars().filter(c->!"aeiouAEIOU".contains(String.valueOf((char)c))).mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
   
      //  str.chars().map(c->(char)c).filter(c->"aeiouAEIOU".contains(String.valueOf(char)c)).collect(Collectors.joining());
        System.out.println(string);
}	






	
}
