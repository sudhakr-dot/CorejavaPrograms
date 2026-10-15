package com.core.java8;

import java.util.function.BiPredicate;

public class Bi_Predicate {
   public static void main(String []args) {
	   
	   BiPredicate<String, Integer> bipredicate=(s,i)->{
		     
		 return s.length() ==i;
	   };
	 
		  
	   
	   System.out.println(bipredicate.test("qw", 2));
	   
   }
} 
