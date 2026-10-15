package com.threads;

public class Join_Method extends Thread{
	
	  public void run() {
		  
		  for(int i=0;i<3;i++) {
			  try {
				  Thread.sleep(300);
				  System.out.println("The current thread name is: " + Thread.currentThread().getName());  

			  }catch(Exception e) {
				 
				  System.out.println("Inside Catch Class"+e);
			  }
		  
		  System.out.println(i);
	  }
	  }
	  public static void main(String[] args) {
		
		  Join_Method jm= new Join_Method();
		  Join_Method jm1= new Join_Method();
		  Join_Method jm2= new Join_Method();
		  
		jm.start();  

		try {
			System.out.println("Execution 1"+Thread.currentThread().getName());
			jm.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		jm1.start();
		
		try {
			System.out.println("Execution 2"+Thread.currentThread().getName());
			jm1.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}	
		
		jm2.start();
	}
	 

}
