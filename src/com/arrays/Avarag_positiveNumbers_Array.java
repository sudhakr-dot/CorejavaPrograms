package com.arrays;

public class Avarag_positiveNumbers_Array {
  public static void main(String[] args) {
	
	  int []arr= {19,-34,-23,10};
	  int sum=0;
	  int count=0;
	  
	  
	  for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			sum=sum+arr[i];
			count++;
		}
	  }
	   
	  
	  System.out.println( sum/count);
}
}
