package com.core.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class CallableDemo implements Callable<Integer> {

	public static void main(String[] args)throws InterruptedException, ExecutionException {
		
		System.out.println("Main Thread Starte...");
		
	//	CallableDemo d=new CallableDemo();
	         ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		System.out.println("Main Thread Ends...");
	}
	
    public Integer call() throws Exception{
    	System.out.println(Thread.currentThread().getName());
    	
		return 2;
    	
    	
    }


	
}
