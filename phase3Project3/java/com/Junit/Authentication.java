package com.JUnit;

public class Authentication {

	public boolean validate(String username ,String password) {
	
		if(username.equals("kalviyarasi")&& password.equals("kalvi")) {
			
			System.out.println("Authentication Succesful");
			return true;}
			
		else {
			System.out.println("Authentication failed");
			return false;
			
		}
	}
}
