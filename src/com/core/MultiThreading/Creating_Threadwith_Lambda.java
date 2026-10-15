package com.core.MultiThreading;

public class Creating_Threadwith_Lambda {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts..");
		for(int i=0;i<10;i++) {
			 Thread th=new Thread(
					
			()->{
				try {
				Thread.sleep(2000);
			}
				catch (Exception e) {
				
				}
		System.out.println("Executing THread:"+Thread.currentThread().getName());		
			}			 );	
			 
		th.start();
	}
		System.out.println("Main Thread Ends..");
	
	
	}	
}
