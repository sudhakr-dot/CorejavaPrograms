package com.core.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
   public static void main(String[] args) {
	  List<Integer> nums=Arrays.asList(1,2,3,4,2,5,6,3,2,7);
	  
Map<Integer,Long> result = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  
System.out.println(result);
	  
	  
 }
}
