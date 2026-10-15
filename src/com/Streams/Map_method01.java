package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_method01 {
   public static void main(String[]args) {
	   
	
	   ArrayList<Employee1> al=new ArrayList<Employee1>();
	   
	   
	   al.add(new Employee1(1, "seenu",1000000));
	   al.add(new Employee1(2, "ram",3000000));
	   al.add(new Employee1(3, "david",4000000));
	   al.add(new Employee1(5, "smith",5000000));
	   al.add(new Employee1(6, "sam",6000000));
	   al.add(new Employee1(12, "suresh",7000000));
	   al.add(new Employee1(1234, "ramya",8000000));

	   
	   List<String> list = al.stream().filter(s->s.getSalary()>30000 &&s.getId()>4 ).map(name->name.getSalary()+"").collect(Collectors.toList());
	   
	   
	   
	   System.out.println(list);
	   
	   String text = "java java python java c c c c++ c++ c++ c++ c++ python";

       Map<String, Long> collect = Arrays.stream(text.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       
       
         Map<String, Long> collect3 = Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));
       
         System.out.println(collect3);
         System.out.println(collect);

          Long max= Collections.max(collect.values());
       
       
          List<String> collect2 = collect.entrySet().stream().filter(entry->entry.getValue()==max).map(e->e.getKey()).collect(Collectors.toList());
       

          System.out.println(collect2);
        
     //  Arrays.stream(text.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       
       
       //  System.out.println(collect);
	   
	   
	   
   }
} 
