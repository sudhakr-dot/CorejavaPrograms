package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Distinct_01 {
  public static void main(String[] args) {
	
	  List<String> citys=Arrays.asList("Hyderabad","goa","Bangalore","Delhi","Hyderabad","goa");
	  
	  List<Integer> nums=Arrays.asList(2,12,23,435,34,34,45,67,88,88,93,12);

	  
	  List<String> list = citys.stream().distinct().collect(Collectors.toList());
	  
	  List<Integer> collect = nums.stream().distinct().collect(Collectors.toList()); 
	  collect.forEach(System.out::println);
	  
	  list.forEach(System.out::println);
	  
	  
	 Map<String, Long> list11 = citys.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
	 
	 System.out.println(list11);
	  
}
}
