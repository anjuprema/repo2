package com.anju.exception;

import java.util.regex.Pattern;

public class ValidateData {
	public boolean validateName(String name) {
		return Pattern.compile("[a-zA-Z]+").matcher(name).matches();
	}
	
	public boolean validatePassword(String pswd) {
		return Pattern.compile("[a-zA-Z0-9]+").matcher(pswd).matches();
	}
	
	public boolean validateAge(Integer age) {
		boolean status = false;
		if(age >= 18 && age <120){
			status = true;
		}
		return status;
	}
}
