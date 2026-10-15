package com.io.streams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader_Example {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * FileReader reader= new FileReader("C:\\SPRING_NEW\\Test.txt"); BufferedReader
		 * br=new BufferedReader(reader);
		 * 
		 * String str; while((str=br.readLine() )!= null) {
		 * 
		 * System.out.println(str);
		 * 
		 * }  
		 */
		
		File file=new File("C:\\SPRING_NEW\\Test.txt");
		
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
		}

}
