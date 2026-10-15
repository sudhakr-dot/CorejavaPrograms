package com.Stream.Basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAdvance {

	public static void main(String[] args) {
		
		
		List<String> citys = Arrays.asList("Hyderabad", "goa", "Bangalore", "Delhi", "Hyderabad", "goa","try","cry");
		//Given a list of strings, group a list of strings by the first letter of each string using streams
   Map<Object, List<String>> collect = citys.stream().collect(Collectors.groupingBy(s->s.charAt(0),LinkedHashMap::new,Collectors.toList()));
		 // System.out.println(collect);
		  
		  
		  List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		      Map<Boolean, List<Integer>> collect2 = asList.stream().collect(Collectors.partitioningBy(a->a%2==1));
		        
				/*
				 * for(Map.Entry<Boolean, List<Integer>> entry:collect2.entrySet()) {
				 * System.out.println(entry.getKey()); for(int v:entry.getValue()) {
				 * System.out.println(v); } }
				 */
		      
		      
		      int sum = asList.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
		   //   System.out.println(sum);
		     // System.out.println(collect2);
	
	String str="Artificial Intelligence is Future";
	
	Map<Character, Long> collect3 = str.replace(" ", "").toLowerCase().strip().chars().mapToObj(c->(char)c)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	

	   System.out.println(collect3);
	
	}
}
