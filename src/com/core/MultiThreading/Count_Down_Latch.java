package com.core.MultiThreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class Count_Down_Latch {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch=new CountDownLatch(5);
	      System.out.println("Hike Started....");
	      for(int i=1;i<=5;i++) {	    
	      Thread thread=new Thread(
				
				 ()->{
					 System.out.println(Thread.currentThread().getName()+"Getting Ready...");
					 
					sleep(ThreadLocalRandom.current().nextInt(400,600));
					System.out.println(Thread.currentThread().getName()+" Ready...");	
					 },"Friend-"+i);
		thread.start();
		latch.countDown();
				}
		latch.await();
		System.out.println(Thread.currentThread().getName()+" Hiking start...");	

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
