package com.LogicBilding;

public class SingleTon_class {

	private static SingleTon_class instance =null;
	
	private SingleTon_class() {
		
	}
	
	
	private static SingleTon_class getInstance() {
		
		if(instance==null) {
		
	synchronized(SingleTon_class.class) {
		if(instance==null) {
			instance=new SingleTon_class();
		}
	}
		}	
    		return instance;
		
	}
	
	public static void main(String[] args) {
		
	System.out.println(SingleTon_class.getInstance());
	System.out.println(SingleTon_class.getInstance());
	
	
	}
	
}
