package com.anju.exception;


public class ArithmeticOperation {
	float result;
	public void addition(float a, float b){
		result = a + b;
		System.out.println(a+" + "+b+" = "+result);
	}
	
	public void subtraction(float a, float b) {
		result = a - b;
		System.out.println(a+" - "+b+" = "+result);
	}
	
	public void multiplication(float a, float b) {
		result = a * b;
		System.out.println(a+" * "+b+" = "+result);
	}
	
	public void division(float a, float b) {
		result = a / b;
		System.out.println(a+" / "+b+" = "+result);
	}
}
