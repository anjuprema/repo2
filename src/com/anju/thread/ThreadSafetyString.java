package com.anju.thread;
import java.io.IOException;

/**
 * - Incorrect o/p while using String Wrapper class and StringBuilder
 *   as they are thread not safe.
 * - Correct o/p while using StringBuilder as it is thread safe.
 * **/
public class ThreadSafetyString {
	//static String myString = "aaa";
	static StringBuilder myString = new StringBuilder();
	//static StringBuffer myString = new StringBuffer();
	public void updateString(String s) {
		//myString = myString.concat(s);
		myString = myString.append(s);
	}
	public static void main(String args[]) throws IOException {
		ThreadSafetyString ts = new ThreadSafetyString();
		try {
			Runnable r1 = ()-> {
				for(int i=0; i<3;i++) {
					ts.updateString("-aaa");
				}
			};
			
			Runnable r2 = ()-> {
				for(int i=0; i<3;i++) {
					ts.updateString("-bbb");
				}
			};
			
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		}catch(Exception e) {}
		
		
		System.out.println(myString);
	}
}
