package com.strings;

public final  class ImmutableTest {

public static void main(String[] args) {
		
		ImmutableClass i=new ImmutableClass("NAWP123S");
		
		String panNUmber = i.getPanNUmber();
		
		
		System.out.println(panNUmber);
	}
	
}

class ImmutableClass{
	
private final String panNUmber;
	
	public ImmutableClass(String panNUmber){
		
		this.panNUmber=panNUmber;
	}
	
	public String getPanNUmber() {
		return panNUmber;	
	}
	
	
	
}