package com.anju.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArithmeticCalculator {

	public static void main (String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the equation seperated by spaces. (eg: 25 + 45)");
		String eq = new String (br.readLine());
		String [] val = eq.split(" ");
		float val1 = Float.valueOf(val[0]);
		float val2 = Float.valueOf(val[2]);
		
		ArithmeticOperation op = new ArithmeticOperation();
		
		if(val.length == 3) {
			switch(val[1]) {
			case "+":
				op.addition(val1, val2);
				break;
				
			case "-":
				op.subtraction(val1, val2);
				break;
				
			case "/":
				op.division(val1, val2);
				break;
				
			case "*":
				op.multiplication(val1, val2);
				break;
				
			default: 
				System.out.println("Sorry! Calculator can perform only basic operation.");
				break;
			}
		}else System.out.println("Not a valid expression!!");
		

	}
}
