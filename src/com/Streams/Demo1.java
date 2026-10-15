package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {
  public static void main(String[] args) {
	
	  //Given a List<String>, write a Java 8 expression to print each string in uppercase.
	  
	  List<String> list= new ArrayList<>();
	  list.add("sudhakar");
	  list.add("Raju");
	//  list.add(null)
	  
	  
	  List<String> list2 = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	  String collect = list2.stream().collect(Collectors.joining(","));
	  
	 
  System.out.println(list2);
  //Given a List<Integer>, write a Java 8 expression to remove duplicates.
  
  List<Integer> intlistIntegers=Arrays.asList(1,2,4,5,6,7,2,4,8,23,23);
  
 //List<In> intlistIntegers.stream().distinct().collect(Collectors.toList());
  
//  Map<Integer,String> map=new HashMap<>();
//  
//  map.put(1,"apple");
//  map.put(2, "Banana");
//  
// map.entrySet().stream().filter(entry->entry.getValue().startsWith("A")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
// 
 Map<String, Integer> unsortMap = new HashMap<>();
 unsortMap.put("z", 10);
 unsortMap.put("b", 5);
 unsortMap.put("a", 6);
 unsortMap.put("c", 20);
 unsortMap.put("d", 1);
 unsortMap.put("e", 7);
 unsortMap.put("y", 8);
 unsortMap.put("n", 99);
 unsortMap.put("g", 50);
 unsortMap.put("m", 2);
 unsortMap.put("f", 9);
//sort based on key a,b,c
 
 
  
  }
}
