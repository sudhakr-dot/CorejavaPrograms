package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Flatmap_01 {

	
	public static void main(String[] args) {
		
		List<List<String>> asList = Arrays.asList(Arrays.asList("java","spring","jdbc"),
				      Arrays.asList("Angular","java script"),
				      Arrays.asList("Mysql","oracle")
				      
				  );
		
		List<String> list = asList.stream().flatMap(skill->skill.stream()).collect(Collectors.toList());
		
		list.stream().filter(a->a.startsWith("j")).forEach(System.out::println);
		
		
	}
}
