package com.core.java8;

public class MethodRefrence01 {
	
	public static int add01(int c,int d) {
		  int  e =c+d;
		return  e;
	}
     public static void main(String[] args) {
	
    	 Interface01 i=(a,b)->{
    		    int c=a+b; 
    		
    		 return c;
    		
      	 };
      	 
     	  System.out.println(i.add(10, 20));
     	 Interface01 i1=MethodRefrence01::add01;
     	 
     	System.out.println(i1.add(100,20));
	}
	
}
