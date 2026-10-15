package com.core.java8;

import java.util.function.Predicate;

public class Predicate_01 {
	
    public static void main(String []args) {
    
    String [] arr= {"Sum","String","hello","Springboot"};
    	
   
    
    Predicate<String>	P= s->s.charAt(0) == 'S';
    
    Predicate<String>	p1= s1->s1.length() >= 5;

   
    for(String str:arr) {
    	if(P.and(p1).test(str)) {
    	System.out.println(str);
    			
    	}
    }
    	
    	
    }
}
