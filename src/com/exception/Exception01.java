package com.exception;

public class Exception01 {
  
	public static void main(String []args) {
		
		try {
			
			int diviend=10;
			int divisor=0;
			
			int result=diviend/divisor;
			System.out.println("Result "+result);
				
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
}
