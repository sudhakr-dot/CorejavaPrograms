package com.Streams;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorted {
   public static void main(String []args) {
	   
	   List<Integer> nums=Arrays.asList(-1,2,12,23,435,34,34,45,67,88,88,93,12);
	   
	        List<Integer> list = nums.stream().sorted().collect(Collectors.toList());
	        
	        System.out.println(list);
	        
	        List<Integer> list1 = nums.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	        
	        System.out.println(list1);

	      //  sort The java program given String natural order
	        
	        String str="Gaurav Kumar works at Multinational Corporation";
	        
	      String[] split = str.split(" ");
	      
	      List<String> strs=Arrays.asList(split);
	   
	      List<String> list2 = strs.stream().map(a->a.toLowerCase()).sorted(Comparator.comparing(a->a.toString())).collect(Collectors.toList());
	      
	      System.out.println(list2);
	      
	      
	      
	      
	      
	      
	      File f= new File("abc.txt");
			
			System.out.println(f.exists());
			
			System.out.println("Hello");
			
	      
	      
			  
		     //input;  My name is sudhakar, sudhakar is having 3.5 years experience
		     
		     String text="My name is sudhakar, sudhakar is having  years experience";
		     
		      text.replace(",", " ");
		    
		     String temp="";
		         
		    Map<String ,Integer> map=new HashMap<>();
		    
		    for(char c:text.toCharArray()){
		        if(c !=' '){
		            temp =temp+c;
		        }else if(!temp.isEmpty()){
		        map.put(temp, map.getOrDefault(temp,0) + 1); 
		        temp ="";
		        }
		    }
		    if(!temp.isEmpty()){
		       map.put(temp, map.getOrDefault(temp,0) + 1);  
		    }
		 
		 
		 System.out.println(map);
	      
	      
	      
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

   }
}
