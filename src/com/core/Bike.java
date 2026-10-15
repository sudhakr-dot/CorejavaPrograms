package com.core;

class Splendor{  
	int a=10;
	  void run(){System.out.println("running");}  
	} 

	class   Bike extends Splendor{  
	 
	 Bike(){
		 super.run();
	 }
	 void run(){System.out.println("running safely with 60km");} 
	 
	 
	  public static void main(String args[]){  
		  Splendor b = new Bike();//upcasting  
	     // b.run();
		 
		 
	  }  
	}  