package com.Streams;

import java.util.Arrays;
import java.util.List;

public class ToArray {
   public static void main(String[] args) {
	  List<Integer> al= Arrays.asList(-1, 2, 12, 12, 23, 34, 34, 45, 67, 88, 88, 93, 435);
	   
	    Object[] array = al.stream().toArray();
	    System.out.println(Arrays.toString(array));
	    
	    
		  List<String> citys=Arrays.asList("Hyderabad","goa","Bangalore","Delhi","Hyderabad","goa");
		  
            /* String[] strings = citys.stream().toArray(a->new String[a]);
             
             
             System.out.println(Arrays.toString(strings));
             */
		  
		  String[] array2 = citys.stream().toArray(String[]::new);
		  System.out.println(Arrays.toString(array2));
          
		  

	    
}
}
