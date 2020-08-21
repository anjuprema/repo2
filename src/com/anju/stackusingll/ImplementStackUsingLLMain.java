package com.anju.stackusingll;

public class ImplementStackUsingLLMain {

	public static void main(String[] args) {
		/*implement stack using linked list*/
		Process p1 = new Process(1112, "Process 1");
		Process p2 = new Process(2123, "Process 2");
		Process p3 = new Process(1009, "Process 3");
		Process p4 = new Process(3243, "Process 4");
		Process p5 = new Process(2209, "Process 5");
		LLasStack ll = new LLasStack();
		
		System.err.println("Pushing -> "+p1.getProcessName()+","+p2.getProcessName()+","
				+p3.getProcessName()+","+p4.getProcessName()+","+p5.getProcessName());
		ll.push(p1);		
		ll.push(p2);		
		ll.push(p3);
		ll.push(p4);
		ll.push(p5);
		
		System.out.println("");
		System.out.println("-----    Stack    -------");
		System.out.println("Count: "+ll.getCount());
		ll.printStack();
		System.out.println("-------------------------");
		
		System.out.println("");
		System.err.println("Popping the top process: "+ll.top().getProcessName());
		ll.pop();
		System.out.println();
		System.out.println("-----    Stack    -------");
		System.out.println("Count: "+ll.getCount());
		ll.printStack();
		System.out.println("-------------------------");
		
		System.out.println("");
		System.err.println("Popping all elements till empty: ");
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		System.out.println();
		System.out.println("-----    Stack    -------");
		System.out.println("Count: "+ll.getCount());
		ll.printStack();
		System.out.println("-------------------------");
	}

}
