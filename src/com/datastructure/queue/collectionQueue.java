package com.datastructure.queue;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * Queue comes under Collection
 * 
 * Duplicate values are permitted
 * Do not allow NULL
 * 
 * 1. Priority Queue - Sorts data by default
 * 2. Linked List (ArrayDeque) - Preserves the order
 **/
public class collectionQueue {
	public static void main (String args[]) throws IOException{
		Queue <Integer> marks = new PriorityQueue <Integer>();
		marks.add(40);
		marks.add(39);
		marks.add(44);
		marks.add(29);
		marks.add(40);
		System.out.println("Marks in priority Queue: "+marks);
		
		System.out.println("------------------------------------------------");
		
		Deque <String> myFriends = new ArrayDeque <String> ();
		myFriends.add("Siya");
		myFriends.add("Jiya Vijay");
		myFriends.add("Priya");
		myFriends.add("Priya");
		/* addFirst(), and addLast() are available for Deque only not Queue
		 * can push data from both ends. cannot sort deque
		 **/
		myFriends.addFirst("Drishti");
		myFriends.addLast("Poonam Kappor");
		System.out.println("My friends in Array Dequeue: "+myFriends);
		System.out.println("Popped: "+myFriends.pop());
		System.out.println("My friends: "+myFriends);
		myFriends.push("Thania");
		System.out.println("Pushed Thania: "+myFriends);
		System.out.println("Iterating in descending order:");
		Iterator itr = myFriends.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
