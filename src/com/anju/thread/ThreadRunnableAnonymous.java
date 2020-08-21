package com.anju.thread;

public class ThreadRunnableAnonymous {
	public static String str = "*";

	public static void main(String args[]){
		Runnable r1 = new Runnable(){
			public void run() {
				for(int i=0; i<5; i++) {
					ThreadImplementRunnable.str = ThreadImplementRunnable.str.concat("-#");
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ThreadImplementRunnable.str);
	}

	
}

