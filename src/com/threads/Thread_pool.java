package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pool implements Runnable {
	
	private int no;
	
	
	public Thread_pool(int s) {
		
		this.no=s;
	}
	@Override
    public void run() {
    	System.out.println(Thread.currentThread().getName()+"no   :"+no);
    	System.out.println("run Method In side");
    	process();
    }
	
	public void process() {
		System.out.println("Process Method");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public static void main(String[] args) {
		
        ExecutorService executorService = Executors.newFixedThreadPool(5);  

        
        for(int i=0;i<5;i++) {
        	
        	Thread_pool tp=new Thread_pool(i);
        	executorService.execute(tp);
        }
        executorService.shutdown();  

    	
	}
    
    
    

}
