package com.core.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_duplicate_Strings {
   
	 public static void main(String []args) {
		 String str="hello world hello World";
		 
		// String [] s1=str.toLowerCase().split(" ");
      
		 List<Integer> s1=Arrays.asList(10,20,30,40,45,12,10,20);
		 
	Map<Integer,Integer> map=new HashMap<>();
		 
	
	
	
		 
		// Map<String,Integer> map=new HashMap<>();
		 
		 
		 for(int s:s1) {
			 
			if( map.containsKey(s)) {
			  map.put(s, map.get(s)+1);
			}else {
				map.put(s,1);
			}
		
		 }
		 
		 
		 
	System.out.println(map);	 
	
	/*
	 * List<> al=Arrays.asList(s1);
	 * 
	 * al.stream().map(str->str).collect(Collectors.groupingBy(str->str) ,
	 * Collectors.counting());
	 * 
	 * 
	 * List list= Arrays.asList(s1);
	 */
	//list.stream().map(str->str).collect(Collectors.groupingBy(str1->str1), Collectors.counting());
	
	
	   
	      
	   
	   
	
		 
		 
	 }
	
}
