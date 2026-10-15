package com.core.MultiThreading;




public class PrintEvenOddNumbersintwoThread implements Runnable{

	public void run() {
		for(int i=0;i<=10;i++) {         
			
			if(i%2==0 && Thread.currentThread().getName().equals("Even")) {
		   System.out.println("Th1 :"+i);
		      }
			if(i%2==1 && Thread.currentThread().getName().equals("odd")) {
				System.out.println("th2 :"+i);
				}	
		}
	}
	
public static void main(String[] args) {
	
	
	 
	Runnable t1=new PrintEvenOddNumbersintwoThread();
	
	Runnable t2= new PrintEvenOddNumbersintwoThread();
	
	new Thread(t1,"Even").start();
	new Thread(t2,"odd").start();
	
	
	}

}



