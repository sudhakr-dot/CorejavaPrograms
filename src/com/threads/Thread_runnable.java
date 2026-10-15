package com.threads;

public class Thread_runnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("Runnable Strted.....");
System.out.println("Runnable Ended....");
    String name = Thread.currentThread().getName();
    
    System.out.println(name +": Runnable");
	}
	
	public static void main(String[] args) {
			  
		Thread th= new Thread(new Thread_runnable());
		
		th.start();
	}
	

}
