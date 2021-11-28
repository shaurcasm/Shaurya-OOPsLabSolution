package com.shaurya.service;

import java.util.Random;

import com.shaurya.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)\r\n";
		
		Random random = new Random();
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] password = new char[8];
		for(int i = 0; i < password.length; i++) {
			int index = random.nextInt(values.length());
			password[i] = values.charAt(index);
		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName + lastName + "@" + department + ".shaurya.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    -----> " + email);
		String pass = new String(generatedPassword);
		System.out.print("Password -----> " + pass);
	}
}
