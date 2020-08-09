package com.datastructure.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List comes under Collection
 * ----------------------------
 * Accepts duplicate values
 * NULL value not accepted
 * Preserves insertion order
 * 
 * 1. Array List - internally stores as dynamic array
 * 2. Vector - internally stores as dynamic array
 * 3. Linked List - internally stores as doubly LL
 * 
 **/
public class collectionList {
	public static void main (String args[]) throws IOException {
		List <String> fruits = new ArrayList<String> ();
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Dragon fruit");
		fruits.add("Apple");
		fruits.add("Kiwi");
		System.out.println("List of fruits: "+fruits);
		Collections.sort(fruits);
		System.out.println("List of sorted fruits: "+fruits);
		
		System.out.println("--------------------------------------------------------");
		
		List <Double> tradePoints = new Vector <Double> ();
		tradePoints.add(34.567);
		tradePoints.add(2234.56);
		tradePoints.add(458.3345);
		tradePoints.add(458.3345);
		System.out.println("Trade Points from Vector: "+tradePoints);
		Collections.sort(tradePoints);
		System.out.println("Sorted Trade points from Vector: "+tradePoints);
		
		System.out.println("--------------------------------------------------------");

		List <Float> balanceMoney = new LinkedList <Float> ();
		balanceMoney.add((float) 12.6);
		balanceMoney.add((float) 44.23);
		balanceMoney.add((float) 23.0);
		balanceMoney.add((float) 12.6);
		System.out.println("Balance Money from Linked List: "+balanceMoney);
		Collections.sort(balanceMoney);
		System.out.println("Sorted balace money from Linked List: "+balanceMoney);
	}
}
