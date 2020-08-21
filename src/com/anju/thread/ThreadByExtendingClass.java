package com.anju.thread;

public class ThreadByExtendingClass extends Thread{
	public static String str = "a";
	public void run() {
		str = str.concat("-b");
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		ThreadByExtendingClass tc = new ThreadByExtendingClass();
		ThreadByExtendingClass tc2 = new ThreadByExtendingClass();

		tc.start();
		tc2.start();
		try {
			tc.join();
			tc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(ThreadByExtendingClass.str);
	}
}
