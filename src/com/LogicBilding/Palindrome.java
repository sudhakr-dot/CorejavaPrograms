package com.LogicBilding;

public class Palindrome {
	public static void main(String[] args) {
		int num=554;
		int rem;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp) {
		System.out.println("Plindrome ");
	}
	}
}
