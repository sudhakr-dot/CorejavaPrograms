package com.Stream.Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamBasics {

	 public static void main(String[] args) {
		
			List<String> citys = Arrays.asList("Hyderabad", "goa", "Bangalore", "Delhi", "Hyderabad", "goa","try","cry");
			
		//Find Second repeated Character in Sting using java 8 Stream API

		/*
		 * String str1="Sudhakara";
		 * str1.chars().mapToObj(c->(Char)c).collect(Collectors.groupingBy(c->c,Function
		 * .identity()));
		 */
	    //Sorted Based on name
		   List<String> sortedcitys = citys.stream().sorted().collect(Collectors.toList());
		 System.out.println(sortedcitys);
      //Get the list of strings where the length of each element is greater than 5 and get the count

			long count = citys.stream().filter(e->e.length()>5).count();
		  
			System.out.println(count);
	//. Get the list of strings having a particular word		
			
		 List<String> word = citys.stream().distinct().filter(city->city.contains("goa")).collect(Collectors.toList());
		 System.out.println(word);
		 
	//Sort the list of strings based on their lengths in ascending/descending order.
		 
		// List<String> list = citys.stream().sorted((o1, o2) -> o2.length()-o1.length()).collect(Collectors.toList());
		 List<String>list=citys.stream().sorted(Comparator.comparing(str->str.length())).collect(Collectors.toList());
         System.out.println(list);
		 List<String> list1 = citys.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		 System.out.println(list1);
	
	//Get the list of strings having vowels 
		   long Vowels = citys.stream().filter(s->s.matches(".*[aeiou].*")).count();
		   List<String> NotVowels = citys.stream().filter(s->!s.matches(".*[aeiou].*")).collect(Collectors.toList());

		   System.out.println(Vowels);
           System.out.println(NotVowels);		   
		 
	//Write a Java program to create a new list of strings, where each string is reversed from the original list, using Java streams.
	 
		    List<StringBuilder>  reverseachString= citys.stream().map(str->new StringBuilder(str).reverse()).collect(Collectors.toList());
	               
		    System.out.println(reverseachString);
		    
	 // 	    
	                       
		 
	}
	
}
