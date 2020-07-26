package com.anju.exercises;

import java.io.IOException;
import java.util.Scanner;

public class TypeCasting {
	public static void main (String args[]) throws IOException{
		try {
			Scanner sc = new Scanner(System.in);
			int intVal;
			float floatVal;
			double dblVal;
			byte byteVal;
			
			System.out.print("Enter an integer value: ");
			intVal = sc.nextInt();
			floatVal = intVal;
			System.out.println("Convered to float value as: "+floatVal);
			dblVal = intVal;
			System.out.println("Convered to double value as: "+dblVal);
			byteVal = (byte) intVal;
			System.out.println("Convered to byte value as: "+byteVal);
		}catch(Exception e) {
			System.out.println("Invalid Data!..");
		}
	}
}
