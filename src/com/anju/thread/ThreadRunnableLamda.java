package com.anju.thread;

public class ThreadRunnableLamda {
	public static String str = "00";
	
	public static void main(String args[]) {
		Thread t1 = new Thread ( () -> {
			str = str.concat("-88");
		});
		t1.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(str);
	}
}
