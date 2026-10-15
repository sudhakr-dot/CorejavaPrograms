package com.threads;

public class Sleep_Method extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Sleep_Method sl=new Sleep_Method();
		sl.start();
	}
}
