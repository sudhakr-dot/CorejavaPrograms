package com.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sorted_01 {
  
	public static void main(String[] args) {
		
		
		String input="Hyderabad";
		  
		  Map<Character, Long> map2 =
		  input.chars().mapToObj(c->(char)c).collect(Collectors.
		  groupingBy(a->a,LinkedHashMap::new ,Collectors.counting()));
		  
		  map2.forEach((k,v)-> System.out.println(k+ ":"+v));
		  
		  
		 Optional<Character> findFirst = map2.entrySet().stream().filter(entry ->entry.getValue()==1).map(entry->entry.getKey()).skip(1).findFirst();
		  
		
		 System.out.println(findFirst);
		  
	}
}
