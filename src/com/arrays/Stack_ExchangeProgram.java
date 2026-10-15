package com.arrays;

public class Stack_ExchangeProgram {
	
	public static void main(String[] args) {
		
		int arr[]= {8,6,9,10,14,18};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			  
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
	//	System.out.println(min);
				
		int len=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				len=i;  
			}
			
		}
		System.out.println(len);
		
		int max=0;
		
		for(int i=len;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//System.out.println(max);
		
		System.out.println(max-min);
		
		
		int low=arr[0];
		int temp=0;
	for(int i=1;i<arr.length;i++) {
		
	
	}
		
		
	}

}
