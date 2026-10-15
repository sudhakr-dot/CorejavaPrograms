package com.Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Vowels {
	public static void main(String[] args) {
		
		String input="sudhakara";
		
		String input1="sudhakara";
		//Finding first Repeated Character
		HashSet<Character> set=new HashSet<Character>();
		
		Optional<Character> findFirst2 = input1.chars().mapToObj(c->(char)c).filter(c->!set.add(c)).findFirst();
		
      	System.out.println(findFirst2);
		
	
      	//vowelFrequency in stream API
	Map<Character, Long> vowelFrequency = input.toLowerCase().chars() // to lowercase & get IntStream
	                .mapToObj(c -> (char) c)
	                .filter(c -> "aeiou".indexOf(c) != -1) // Keep only vowel
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(vowelFrequency);
		
		
		 ArrayList<Student> students=new ArrayList<Student>();
		    
		    students.add(new Student(1, "Raj","java", 'M',22));
		    students.add(new Student(1, "rama",".NET", 'F',24));
		    students.add(new Student(1, "arjun","java", 'M',24));
		    students.add(new Student(1, "arya","Devopes", 'M',30));
		    students.add(new Student(1, "krishna","Devopes", 'M',24));
		    students.add(new Student(1, "madhav",".NET", 'F',21));

		    Map<String, List<String>> collect = students.stream().
		    		collect(Collectors.groupingBy(Student::getDept,Collectors
		    				.mapping(Student::getName, Collectors.toList())));
		  

	 Optional<Integer> findFirst = students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.counting()))
		   .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).skip(1).findFirst();
		   
		   System.out.println(findFirst);
			/*
			 * collect.forEach((key,value)->{
			 * System.out.println("key="+key"+","+"value"+value); });
			 */
			  
			  
		    List<String> collect2 = collect.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
		    System.out.println(collect2);
			
			  collect.forEach((key, value) -> {
				        System.out.println("Key=" + key + ", Value=" + value);
				    });
				

		    

	}
}
