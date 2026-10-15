package com.arrays;

import java.util.Arrays;

public class Multiplication_Array {
 
	public static void main(String []args) {
		
		int arr[]= {1,2,3,4};
	int len=arr.length;
	//System.out.println(len);
		int  result[]=new int[len];
		int prod =1;
		
		for(int i=0;i<arr.length;i++) {
			
			prod= prod*arr[i];	
		}
		//System.out.println(prod);
	//	int res=prod/arr[0];
		//System.out.println(res);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=prod/arr[i];
			result[i]=arr[i];
			//System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(result));  
		
	}
	
}
