package com.core.MultiThreading;

import java.util.concurrent.ThreadLocalRandom;

public class RunThread2_Thread3_AfterThread1 {

	public static void main(String[] args) {
		
	 Thread t1=new Thread(
			 
			 ()->{
				 System.out.println("T1 Thread Execution Started....");
				 for(int i=0;i<10;i++) {
					sleep(ThreadLocalRandom.current().nextInt(400,600));
				System.out.println("T1 setup is processing..."+(i+1)*10);	
				 }
			    System.out.println("T1 Thread Execution ended...." );	 
			 }
			 );
Thread t2=new Thread(
			 
			 ()->{
				 try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("T2 Thread Execution Started....");
				 for(int i=0;i<10;i++) {
					sleep(2000);
				System.out.println("T2  is processing..."+(i+1)*10);	
				 }
			    System.out.println("T2 Thread Execution ended...." );	 
			 }
			 );

Thread t3=new Thread(
		 
		 ()->{
			 try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("T3 Thread Execution Started....");
			 for(int i=0;i<10;i++) {
				sleep(2000);
			System.out.println("T3 setup is processing..."+(i+1)*10);	
			 }
		    System.out.println("T3 Thread Execution ended...." );	 
		 }
		 );


    t1.start();
    t2.start();
    t3.start();



	}

	private static void sleep(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
