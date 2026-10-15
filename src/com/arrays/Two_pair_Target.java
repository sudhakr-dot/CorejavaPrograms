package com.arrays;

public class Two_pair_Target {

	public static void main(String []args) {
		
		int arr[]= {10,19,20,33,56,0};
		
		int target=43;
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int currentsum=arr[i]+arr[j];
			
			if(currentsum==target) {
				
				System.out.println(arr[i] +" "+arr[j]);
			}if(currentsum>target) {
				j--;
			}
			
			if(currentsum<target) {
				i++;
			}
		}
		
		
	}
	
}
