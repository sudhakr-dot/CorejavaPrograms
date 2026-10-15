package com.LogicBilding;

public class HallowSquare {

	public static void main(String[] args) {
		
		/*int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||i==n||j==0||j==n) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}*/
		
		
		int n=3;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			for(int k=0;k<=n;k++) {
				System.out.print("_ ");
			}
			System.out.println();
		}
	}
	
}

