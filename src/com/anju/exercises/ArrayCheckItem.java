package com.anju.exercises;
import java.util.Scanner;

public class ArrayCheckItem {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayCheckItem a = new ArrayCheckItem();

	protected void getItem(String[] grocerryList) {
		System.out.println("Enter the item that you need to check in list: (Enter 'exit' to quit)");
		String item = sc.nextLine();
		if(! item.equals("exit"))
		a.checkItemAvailability(grocerryList, item);
	}
	
	protected void checkItemAvailability(String[] l, String item) {
		boolean isPresent =false;
		for(int i=0; i<l.length; i++) {
			if(l[i].equals(item)) isPresent = true;
		}
		
		if(isPresent) System.out.println("Item present.");
		else System.out.println("Item not Present");	
		
		a.getItem(l);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the list of grocerries seperated by comma");
		String gList = sc.nextLine();
		String [] grocerryList = gList.split(",");
		if(grocerryList.length >0) {
			a.getItem(grocerryList);
		}
	}

}
