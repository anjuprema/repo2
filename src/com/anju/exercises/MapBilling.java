package com.anju.exercises;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class MapBilling {

	public static void main(String[] args) {
		Map <String, Double> myBills = new Hashtable <String, Double>();
		myBills.put("Grocessary", 234.50);
		myBills.put("Milk", 500.45);
		myBills.put("Snacks", 50.00);
		myBills.put("Life Insurance", 3000.00);
		myBills.put("School fee", 23000.00);
		myBills.put("Medical bill", 4500.00);
		myBills.put("Transport", 345.50);
		
		System.out.println("My Bills: "+myBills);
		
		//System.out.println();
	}

}
