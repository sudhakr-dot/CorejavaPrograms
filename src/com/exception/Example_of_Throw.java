package com.exception;

public class Example_of_Throw {

	public static void main(String[] args) {
		
		
		int age=15;
		
		if(age<18) {
			throw new ArithmeticException("The person is not Elgibile to Vote....");
		}
	}
	
}
