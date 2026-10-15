package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_Duplicate_Elements {

	public static void main(String[] args) {
		
		 int[] arr = { 2,2, 5, 6, 2, 1, 3, 1, 8, 3 };
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					// System.out.println(arr[i]);
				 }
			 }
		 }
		 
	        HashSet<Integer> seen = new HashSet<>();
   ArrayList<Integer> list=new ArrayList<>();
		 for (int num : arr) {
	            // If num is already in 'seen', add it to the list of duplicates
	            seen.add(num);
              list.add(num);
               
              
              
	            }
	        
		 
System.out.println(seen);
		
	}
	
}
