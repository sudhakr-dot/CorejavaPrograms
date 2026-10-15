package com.arrays;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,7,5};
		
		int target=7;
		
		int[] twoSum = twoSum(arr, target);
	System.out.println(Arrays.toString(twoSum));
	}		
	
public static int [] twoSum(int arr[] ,int target) {
		for(int i=0;i<arr.length-1;i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
	
}
		return null;		
		
	}
}
