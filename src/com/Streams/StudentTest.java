package com.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
   public static void main(String []args) {
	   
	    ArrayList<Student> students=new ArrayList<Student>();
	    
	    students.add(new Student(1, "Raj","java", 'M',22));
	    students.add(new Student(1, "rama",".NET", 'F',24));
	    students.add(new Student(1, "arjun","java", 'M',24));
	    students.add(new Student(1, "arya","Devopes", 'M',30));
	    students.add(new Student(1, "krishna","Devopes", 'M',24));
	    students.add(new Student(1, "madhav",".NET", 'F',21));
	    
	    Map<Object, List<Student>> collect = students.stream().collect(Collectors.groupingBy(a->a.getDept(),
	    		Collectors.collectingAndThen(Collectors.toList(), 
	    				list->list.stream().sorted(Comparator.comparingInt(Student::getAge)).
	    				collect(Collectors.toList()))));
	    
	 System.out.println(collect);
	    
	    
		/*
		 * Map<String,List<Student>> map= sts.stream().collect(Collectors.groupingBy 
		 * (Student::getBranch,Collectors.collectingAndThen(Collectors.toList(),list->
		 * list.stream().sorted(Comparator.comparingDouble(Student::getMarks))
		 * .collect(Collectors.toList()))));
		 */
	    
	    
	    
	    List<Student> collect2 = students.stream().sorted(Comparator.comparing(Student::getAge ,Comparator.reverseOrder()).thenComparing(Student::getName)).collect(Collectors.toList());
	    
	    
	 
	    Map<String, List<Student>> collect3 = students.stream().collect(Collectors.groupingBy(s->s.getName(), Collectors.toList() ));
	    
	    
	//   collect3.forEach((name,Student)->{System.out.println(name+"  "+Student);});
	    
	   // System.out.println(collect3);

	   	   
	   // System.out.println(collect2);
	    
   }



} 
