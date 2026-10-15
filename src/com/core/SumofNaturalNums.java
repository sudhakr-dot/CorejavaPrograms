package com.core;

public class SumofNaturalNums {
	
	public static int sumofnums(int n) {
		if(n==0) {
			return 0;
		}
		
		int sum=n*(n+1)/2;
		return sum;
	}
	
	public static boolean prime(int n){
		
		if(n <=1) {
			
			return false;
		}
	
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
	
		System.out.println(SumofNaturalNums.sumofnums(5));
	}
	
	
}
