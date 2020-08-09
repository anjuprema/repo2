package com.datastructure.map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * 
 * 1. Hash Map - accepts null, overwrites duplicate keys, allows duplicate values
 * 2. Hash Table - do not accept null,
 * 3. Tree Map
 * **/
public class Maps {
	public static void main (String args[]) throws IOException{
		Map <Integer, String> hashMap = new HashMap <Integer, String>();
		hashMap.put(1, "Mango");
		hashMap.put(2, "Appple");
		hashMap.put(3, "Orange");
		hashMap.put(4, "Mosambi");
		hashMap.put(5, "Mango");
		hashMap.put(null, null);
		
		/*one way to loop*/
		for(Map.Entry fruit: hashMap.entrySet()) {			
			 System.out.println(fruit.getKey() + " : " +fruit.getValue());
		}
		
		/*second way to loop*/
		Set <Integer> keys = hashMap.keySet();
		for(Integer key : keys) {
			System.out.println(hashMap.get(key));
		}
		
		System.out.println("----------------------------------------------");
		
		Map <String, String> hashTable = new Hashtable <String, String> ();
		hashTable.put("one", "Parrot");
		hashTable.put("two", "Carrot");
		hashTable.put("three", "Tomato");
		hashTable.put("two", "Lotus");
		hashTable.put("four", "Cucumber");
		System.out.println(hashTable);
		
		System.out.println("----------------------------------------------");
		
		Map <Integer, Double> treeMap = new TreeMap <Integer, Double> ();
		treeMap.put(23, 2344.45);
		treeMap.put(20, 33.45);
		treeMap.put(11, 456.33);
		treeMap.put(34, 444.30);
		treeMap.put(34, 444.30);
		treeMap.put(67, 33.45);
		
		System.out.println(treeMap);
	}
}
