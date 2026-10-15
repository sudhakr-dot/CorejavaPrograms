package com.core.MultiThreading;

public class TestCustomException {

	 public static void validate(int age) throws CustomException {
		 
		 if(age<18) {
			 
			 throw new CustomException("Not Elgible to Vate");
		 }else {
			 System.out.println("welcome to Vate");
		 }
	 }
	
	 public static void main(String[] args) {
		  
		 try {
			validate(18);
		} catch (CustomException e) {
			System.out.println(e);
		}
		
	}
}
