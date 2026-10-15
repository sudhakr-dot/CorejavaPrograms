package com.threads;

public class Thread_demo extends Thread {
	
	
	
	public void run() {
		
	System.out.println("Thread creation By using The extending Thread");	
	}
	

	public static void main(String []args) {
		
		Thread_demo td = new Thread_demo();
		
		
		td.start();
		
	}
}
