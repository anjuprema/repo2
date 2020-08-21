package com.anju.exception;

public class InvalidAgeException extends Exception{
//	String message;
//	InvalidAgeException (String s){
//		this.message = s;
//	}
//	
//	public String toString() {
//		return "Ecxeption Occured: "+message;
//	}
	public InvalidAgeException(String s){
		super(s);
	}
}
