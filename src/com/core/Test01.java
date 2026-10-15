package com.core;

import java.util.Arrays;

public class Test01 {

	public static int [] removeDuplicates(int[] nums) {
		
		int i = 0;		
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++; 
				nums[i] = nums[j];
			}
		}

		
		return Arrays.copyOfRange(nums, 0, i+1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4 };
	 int[] removeDuplicates = removeDuplicates(arr);
	//	System.out.println("New length: " + length);
		for (int i = 0; i <removeDuplicates.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
