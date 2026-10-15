package com.core;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,3,5,8,10};
		
/*		int target=12;
		
		int i = arr[0];
		int j = arr.length - 1;

		while (i< j) {

			int sum=arr[i]+arr[j];
			
			if(sum==target) {
				
				System.out.println(i+""+j);

			break;
		}else if(sum<target) {
			j++;
		}else {
			i--;
		}*/
	
			int large=arr[0];
			int second_large=arr[0];
			
	for(int l=0;l<arr.length;l++) {
		
		
		if(arr[l]>large) {
		    second_large=large;
			large=arr[l];
		}if(arr[l]>second_large && arr[l]!=large) {
			
			second_large=arr[l];
		}
		
		
	}
System.out.println(large);			
System.out.println(second_large);			
			
			
			
			
		 
		
		
		/*for(int i=0;i<arr.length-1;i++) {
			
			for(int j=1+1;j<arr.length;j++) {
					
				if(arr[i]+arr[j]==target) {
					
					System.out.println(i+""+j);
					
				}
		}*/



   String str="Sudhakar";
   
   int len=str.length();
   
  String res="";
   for(int i=len-1;i>=0;i--) {
	   res=res+str.charAt(i);
	   
   }
   
   
   
   System.out.println(res);
   
       
   
   
   
   
   
   
   
   
   
   
   


				
	}

	
}
