package com.anju.exercises;
import java.io.IOException;
import java.util.Scanner;

public class TypeCastingUsingWrapperClass {
	public static void main(String args[]) throws IOException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			String stringVal = sc.nextLine();
			int intVal;
			float floatVal;
			double dblVal;
			byte byteVal;
			
			intVal = Integer.parseInt(stringVal);
			System.out.println("Convered to int as: "+intVal);
			floatVal = Float.parseFloat(stringVal);
			System.out.println("Convered to float as: "+floatVal);
			dblVal = Double.parseDouble(stringVal);
			System.out.println("Convered to double as: "+dblVal);
			byteVal = Byte.parseByte(stringVal);
			System.out.println("Convered to byte as: "+byteVal);
		}catch(Exception e) {
			System.out.println("Invaid Data!..");
			e.printStackTrace();	
		}
	}
}
