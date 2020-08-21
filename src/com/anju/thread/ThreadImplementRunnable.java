package com.anju.thread;

public class ThreadImplementRunnable implements Runnable{
	public static String str = "*";
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			str = str.concat("-#");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		ThreadImplementRunnable r1 = new ThreadImplementRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread.sleep(200);
		System.out.println(ThreadImplementRunnable.str);
	}

	
}
