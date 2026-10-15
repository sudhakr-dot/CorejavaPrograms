package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwing_a_Checked_Exception {
	
	public static void checkfile()throws FileNotFoundException {
		
		FileReader file=new FileReader("/");
		BufferedReader reader = new BufferedReader(file);
	   System.out.println(reader);	
	   
	   throw new FileNotFoundException();
	   
	   
	}
	
	public static void main(String[] args) {
		try {
			checkfile();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

