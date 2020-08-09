package com.datastructure.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set comes under Collection
 * 
 * Non allows duplicated including duplicate NULL
 * Tree Set does not permit NULL, while HashSet and LinkedHashSet allows NULL
 * 
 * 1. Hash Set - preserves order
 * 2. Linked Hash Set - preserves order
 * 3. Tree Set - sorts data by default, not allow duplicate or NULL
 **/
public class collectionSet {

	public static void main(String[] args) {
		Set <Double> bankBalance = new HashSet <Double> ();
		bankBalance.add(23456.50);
		bankBalance.add(23222.00);
		bankBalance.add(33345.45);
		bankBalance.add(23.44);
		bankBalance.add(23.44);
		bankBalance.add(null);
		bankBalance.add(null);
		System.out.println("Bank balance in Hash Set: "+bankBalance);

	
		System.out.println("--------------------------------------------------");
		
		Set <String> employee = new LinkedHashSet <String> ();
		employee.add("Sharmila");
		employee.add("Rahul");
		employee.add("Sonia");
		employee.add("Modi");
		employee.add("Modi");
		employee.add(null);
		employee.add(null);
		System.out.println("Employees in Linked Hash Set: "+employee);
		
		System.out.println("--------------------------------------------------");
		
		Set <Float> weather = new TreeSet <Float> ();
		weather.add((float) 42.34);
		weather.add((float) 23.51);
		weather.add((float) 50.01);
		weather.add((float) 22.34);
		weather.add((float) 22.34);
		//weather.add(null);
		System.out.println("Weather in Tree Set"+weather);
	}

}
