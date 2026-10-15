package com.core;

interface A {
	default void show() {
		System.out.println("A");
	}
}

interface B {
	default void show() {
		System.out.println("B");
	}
}

class C implements A, B {
	public void show() {
		A.super.show();
		B.super.show();
		System.out.println("C");
	}



public static int toggle(int n) { 
return 7 + 11 - n; 
}
}



public class Object_oriented_Questions {
	
	public static void main(String[] args) {
		
		C c=new C();
		c.show(); 
			
		System.out.println(c.toggle(7)); 
		System.out.println(c.toggle(11)); 
		
	}

}
