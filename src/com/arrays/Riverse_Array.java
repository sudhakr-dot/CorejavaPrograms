package com.arrays;

import java.util.Arrays;

public class Riverse_Array {

	public static void main(String[] args) {
		
		int [] nums= {10,20,30,-3,40,50};
		
		int left=0;
		int right=nums.length-1;
		
		int len=nums.length;
		int  result[]=new int[len];                        

		
		for(int i=len-1;i>-1;i--) {
        // System.out.println(nums[i]);			
		
		 result[len-i-1]=nums[i];
			
		/*
		 * for(int j=0;j<result.length;j++) { result[i]=nums[i];
		 * 
		 * }
		 */
         }
		
		while(left<right)
		{
			 	
			int temp = nums[left];
			nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
		}
			
		
		
		
		
		
		
		System.out.println(Arrays.toString(result));
	}
	
}
