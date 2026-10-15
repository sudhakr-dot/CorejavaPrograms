package com.core;

public class SingleTon_Test {
   public static void main(String []args) {
	 
	   SingleTon object01 = SingleTon.getInstance();
	   SingleTon object02 = SingleTon.getInstance();
	   
	   System.out.println(object01);
	   System.out.println(object02);
	   
   }
}
