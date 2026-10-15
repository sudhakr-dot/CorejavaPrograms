package com.core.MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomaic_Counter {

	private AtomicInteger amc= new AtomicInteger(0);
	
	private void incrementcount() {
		
		amc.incrementAndGet();
		
	}
	
	private int getcount() {
		return amc.get();
		
	}
	


}
