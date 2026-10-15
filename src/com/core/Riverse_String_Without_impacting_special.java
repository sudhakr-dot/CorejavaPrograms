package com.core;

public class Riverse_String_Without_impacting_special {
	
	
public static void reverseString(char[] str) {
		
     int i=0;
		
		int j=str.length-1; 
		
		while(i<j){
			if(!Character.isAlphabetic(str[i])) {          
				i++;
			}else if(!Character.isAlphabetic(str[j])) {
				j--;	
			}else {
				char temp=str[i];
				str[i]=str[j];
				str[j]=temp;
                  i++;
                  j--;
				
			}
		}
		
	}
	
	
	
	
	
	public static void main(String []args) {
		
		String str="a$b@1c&d";
		
		char[] carr=str.toCharArray();
		
      reverseString(carr);
      
      String rev=new String(carr);
      
      System.out.println(rev);
		
	}

}
