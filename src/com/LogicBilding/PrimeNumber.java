package com.LogicBilding;

public class PrimeNumber {
	
	public static int checkprime(int num) {
	   int count =0;
	   int m=num/2;
		for(int i=3;i<=m;i++) {
			if(num%i==0) {
				count =1;
			break;
			}
			return count;
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		int i = checkprime(3);
		
		if(i==0)
		System.out.println("Prime");
		else {
		System.out.println("Not Prime");
		}
			
		
	}

}
