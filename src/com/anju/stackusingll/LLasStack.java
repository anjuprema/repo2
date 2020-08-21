package com.anju.stackusingll;

import java.util.LinkedList;

public class LLasStack {
	public LinkedList<Process> asStack = new LinkedList<Process>();
	public Integer i = 0;

	// push an item into top
	public void push(Process p) {
		if (i != 0) {
			asStack.addLast(p);
		} else {
			asStack.addFirst(p);
		}
		i++;
	}

	// remove an item from top
	public void pop() {
		if (i >= 0) {
			asStack.removeLast();
			i--;
		}
	}

	public Process top() {
		return asStack.getLast();
	}

	public Integer getCount() {
		return i;
	}

	public void printStack() {
		if (i >= 0)
			for (Integer j = i - 1; j >= 0; j--) {
				System.out.println(asStack.get(j).processName);
			}
	}

}
