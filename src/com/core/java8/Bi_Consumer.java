package com.core.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class Bi_Consumer {
	 
  public static void main(String []args) {
	  
	  BiConsumer<Integer, Integer> bc=(a,b)->System.out.println(a+b);
	  
	    bc.accept(10, 20);

	   Map<String ,Integer> map=new HashMap<>();
	   
	   map.put("sita",1);
	   map.put("ram",2);
	   map.put("raj",3);
	   map.put("ravi",4);
	   
	   
	   BiConsumer<String, Integer> bi=(key,value)->System.out.println("key" +key +" "+ value);
	   
	   
	   for(Entry<String, Integer> entry:map.entrySet()) {
		   bi.accept(entry.getKey(), entry.getValue());
		   
		   
	   }
 	   
	   
	   
	   
	  
  }

}
