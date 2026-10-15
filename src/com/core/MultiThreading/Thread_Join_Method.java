package com.core.MultiThreading;

public class Thread_Join_Method extends Thread {

	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Thread name :"+i+"-" +currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread_Join_Method t1=new Thread_Join_Method();
		Thread_Join_Method t2=new Thread_Join_Method();

		t1.start();
		
		t1.join();
		
		t2.start();
	}
	  
	
}
