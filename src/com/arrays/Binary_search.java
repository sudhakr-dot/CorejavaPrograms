package com.arrays;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		
		 int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
		 
		 
		 Arrays.sort(arr);
	        int target = 11;

	        int result = binarySearch(arr, target);

	        if (result == -1) {
	            System.out.println("Element not found.");
	        } else {
	            System.out.println("Element found at index: " + result );
	        }
	}
	 public static int binarySearch(int[] arr, int target) {
		
		 int start=0;
		 int end=arr.length-1;
		 
			  while(start<=end) { 
				  int mid=start+(end-start)/2;
				  
				 if(target<arr[mid]) {
					 
					 end=mid-1;
					
				 }else if(target>arr[mid]) {
					 start=mid+1;
				 }else {
					 return mid;
				 }
				  
				  
				  }
			return -1;
			 
		
		
	}
}
