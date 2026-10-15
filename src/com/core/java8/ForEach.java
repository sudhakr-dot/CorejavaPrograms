package com.core.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
  public static void main(String []args) {
	  
	  List<Integer> al= Arrays.asList(10,20,30,49,45);
	  
	  al.forEach(a->System.out.println(a));
	  
	  Map<String, Integer> scores = new HashMap<>();
		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		
		for(Map.Entry<String ,Integer> e:scores.entrySet()) {
			
			System.out.println(e.getKey() +" "+e.getValue());
		}
		
	   scores.forEach((k,v)->System.out.println("key " + k +"  Value "+ v));
  }
}
