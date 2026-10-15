package com.core.MultiThreading;

public class Synchonization_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c=new Counter();
		
		UpdareCounter counter=new UpdareCounter(c);
		
		Thread t1=new Thread(counter);
		Thread t2=new Thread(counter);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	System.out.println("Final count:"+c.gerCouount());
	}
}

class Counter{
	
	private int counter;
	
	//public synchronized void  increment() {
	
	public  void  increment() {
	  
	//Using Synchronized Block	
		synchronized (this) {
			counter++;
		}
		
	}
	public int gerCouount() {
		return counter;
	}
}
class UpdareCounter extends Thread{
	private Counter counter;
	
	public UpdareCounter(Counter couner) {
		this.counter=couner;
	}
	
public void run() {
	for (int i = 0; i <1000; i++) {
		counter.increment();
	}
}
	
	
}