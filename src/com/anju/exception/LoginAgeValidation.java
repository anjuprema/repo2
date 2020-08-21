package com.anju.exception;

import java.util.Scanner;

public class LoginAgeValidation {
	public static String name;
	public static String pswd;
	public static Integer age;
	public void readCredentials() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your password: ");
		pswd = sc.nextLine();
		System.out.println("Enter your age: ");
		age = Integer.parseInt(sc.nextLine());
	}
	 public void greetUser() {
		 System.out.println("----------------------------");
		 System.out.println("Login Succesful..");
		 System.out.println("Welcome "+name+" .. ");
	 }
	public static void main(String[] args) {
		LoginAgeValidation l = new LoginAgeValidation();
		ValidateData v = new ValidateData();
		System.out.println("************************");
		System.out.println("**       Login        **");
		System.out.println("************************");
		l.readCredentials();
		try {
			boolean status = v.validateName(name);
			if(!status) throw new InvalidDataException("Sorry.. Invalid Name..");
			status = v.validatePassword(pswd);
			if(!status) throw new InvalidDataException("Sorry.. Invalid Password..");
			status = v.validateAge(age);
			if(!status) throw new InvalidAgeException("Sorry.. Age below 18..");
			
			l.greetUser();
		}catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
