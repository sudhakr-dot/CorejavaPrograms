package com.threads;

public class SleepThreadExample extends Thread{
     
	   public void run() {
		   
		   for (int i = 0; i <5; i++) {
			   
		     try {
		    	 System.out.println("Before Sleep:"+i);
				Thread.sleep(5000);
				
				 System.out.println("After Sleep:"+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		     System.out.println(i);
			
		}
	   }
	   
	
	public static void main(String[] args) {
    		
		SleepThreadExample th=new SleepThreadExample();
		th.start();
		
	}
	
	
}

	
