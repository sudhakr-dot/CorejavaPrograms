package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_M01 {
   public static void main(String []args) {
	   
		  List<Integer> al= Arrays.asList( 2, 12, 12, 23, 34, 34, 45, 67, 88, 88, 93, 435);
		  
		  Optional<Integer> findFirst = al.stream().findFirst();
		  
		  System.out.println(findFirst);
		  
		  Optional<Integer> findAny = al.stream().findAny();
		  
		  System.out.println(findAny);
		  

	    
   }
}
