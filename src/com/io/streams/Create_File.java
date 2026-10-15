package com.io.streams;

import java.io.File;

public class Create_File {
	
	public static void mian(String []args) {
		
		File f= new File("abc.txt");
		
		System.out.println(f.exists());
		
		System.out.println("Hello");
		
	}

}
