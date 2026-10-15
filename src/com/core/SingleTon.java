package com.core;

public class SingleTon {
  //  private SingleTon instance =new SingleTon();
      
	  private static SingleTon instance =null;

    
    private SingleTon() {
    	System.out.println("Private - SingleTon");
    }
    //Sigle checked lock
//    public static SingleTon getInstance() {
//    	 System.out.println("getInstance-Method");
//    	if(instance==null) {
//    		instance=new SingleTon();
//    	    System.out.println("getInstance-Method inside if");
//    	}
//    	return instance;
//    }
    //Double Checked Lock
    public static SingleTon getInstance() {  
   	 System.out.println("getInstance-Method");
   	if(instance==null) {
   		System.out.println("inside-if");
   		synchronized (SingleTon.class) {
   			if(instance==null) {
   				instance=new SingleTon();
   		   	    System.out.println("getInstance-Method inside if");

   			}
		}
   		
   	}
   	return instance;
   }
    
    
}
