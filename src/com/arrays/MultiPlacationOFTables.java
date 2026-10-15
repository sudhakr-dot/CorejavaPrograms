package com.arrays;

import java.util.Arrays;

public class MultiPlacationOFTables {

	
	static int[] getTable(int n) {
        // code here
        
        int arr[]=new int[10];
        for(int i=1;i<=10;i++){
             
            
            arr[i-1]=n*i;
            
        }
        
     return arr;   
    }
	
	
	
	public static void main(String[] args) {
		
		int[] table = MultiPlacationOFTables.getTable(2);
		
		System.out.println(Arrays.toString(table));
		
		
	}
}
