package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Comparator01 {
      
	
	public static void main(String[] args) {
		
		 ArrayList<Employee1> al=new ArrayList<Employee1>();
		 
		 al.add(new Employee1(1, "raj",4000));
		 al.add(new Employee1(4, "Bhaskar",5000));
		 al.add(new Employee1(2, "aja",34567));
		 al.add(new Employee1(5, "seenu",98));
		 al.add(new Employee1(3, "smith",567897));
		 
		// System.out.println(al);
		 
		 Collections.sort(al,Employee1.Namecomparator);
		 System.out.println(al);

		 
		 
		 int [] arr1= {3,5,1,6};
		  int [] arr2= {3,4,2,6};
		

   int[] array = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray();
	
        System.out.println(Arrays.toString(array));
        
		 
		 
		
	}
	
}
