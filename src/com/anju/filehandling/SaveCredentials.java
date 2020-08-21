package com.anju.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.anju.exception.InvalidDataException;

public class SaveCredentials {
	public static String URL;
	public static String UName;
	public static String PSWD;
	public static String SEPARATOR = "%%%";
	
	public void readCredentials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Site URL: ");
		URL = sc.nextLine();
		System.out.println("Enter User Name: ");
		UName = sc.nextLine();
		System.out.println("Enter Password :");
		PSWD = sc.nextLine();
	}
	
	public boolean validateURL(String url) {
		return Pattern.compile("[a-zA-Z0-9]+").matcher(url).matches();
	}
	
	public boolean validateData(String data) {
		return Pattern.compile("[a-zA-Z0-9]+").matcher(data).matches();
	}
	
	public boolean saveCredential() throws IOException{
		File f = new File("src\\com\\anju\\filehandling\\UserData.txt");
		if(! f.exists()) {
			f.createNewFile();
		}
		if(f.canWrite()) {
			FileWriter fw = new FileWriter(f,true);			
			fw.append(URL+SEPARATOR+UName+SEPARATOR+PSWD);
			fw.write(System.getProperty("line.separator"));
			fw.close();
		}
		return true;
	}
	public static void main(String args[]) {
		SaveCredentials app = new SaveCredentials();
		System.out.println("****************************************************");
		System.out.println("*                    Welcome                       *");
		System.out.println("*  You can save you login credentials in this App  *");
		System.out.println("****************************************************");
		
		try {
			app.readCredentials();
			if(! app.validateURL(URL)) throw new InvalidDataException("Invalid URL provided..");
			if(! app.validateData(UName)) throw new InvalidDataException("Invalid User Name provided. No special chars permitted..");
			if(! app.validateData(PSWD)) throw new InvalidDataException("Invalid Password provided. No special chars permitted..");
		
			boolean status = app.saveCredential();
			if(status) System.out.println("Saved the credentials successfully..");
		}catch(InvalidDataException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
