package com.core;


public class Reverse_Listof_Strings {
	
	public static void main(String[] args) {
		
		String s="Bangalore Delhi Hyderabad goa";
		
		String[] split = s.split(" ");
		
		System.out.println(split.length);
		StringBuffer sb= new StringBuffer();
		
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			
			   String rev="" ;

		   for(int j=split[i].length()-1;j>=0;j--) {
              sb.append(split[i].charAt(j) + rev);
           
		   }
		  sb.append(" ");
		}
		System.out.println(sb);

	}

	

}
