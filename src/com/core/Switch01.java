package com.core;

public class Switch01 {
 public static void main(String[] args) {
	 
	 int []arr= {10,20,304,56,78,90};
	 int count=0;     
	 	 for (int i = 0; i <arr.length; i++) {
		     if(304==arr[i]) {
		    	 System.out.println("Element Found");
		    	count=1;
		    	break;
		     }
		 }if(count==0) {
			 System.out.println("Element NotFound");
		 }
	 	 
		
	}
}

