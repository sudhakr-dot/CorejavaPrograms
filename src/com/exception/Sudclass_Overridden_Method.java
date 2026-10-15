package com.exception;

 class Parent {
	
	public void sendmsg() throws Exception {
		
		System.out.println("Parent calss method....");
	}

}


public class Sudclass_Overridden_Method extends Parent{
	
    public void sendmsg() throws Exception {
		
		System.out.println("Child calss method....");
	}
	
    
    public static void main(String[] args) throws Exception {
		Parent p=new Sudclass_Overridden_Method();
		
		
		try {
		p.sendmsg();
	    
    }catch (Exception e) {
		
	}
    }
}