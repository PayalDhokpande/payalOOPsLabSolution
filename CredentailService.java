package com.payalservice;

import java.util.Random;

import com.payal_model.Employee;

public class CredentailService {
	
public char[] generatePassword(){
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-*/.?/<>";
	
	String values = capitalLetters+smallLetters+numbers+specialCharacters;

	Random random =new Random();
	  
	char[] password = new char[8];
	
	for(int i=0; i<8; i++) {
		
		password[i] = values.charAt(random.nextInt(values.length()));
	}
	return password;

}
		


public String generateEmailAddress(String firstName, String lastName, String department) {
	// TODO Auto-generated method stub
	return firstName +lastName +"@"+department+".abc.com";
}




public void showCredential(Employee employee, String generateEmail, char[] generatePassword) {
	// TODO Auto-generated method stub
	System.out.println("Dear" + employee.getFirstName()+ "Your generated credentials are as follows");
	System.out.println("Email -->" + generateEmail);
	System.out.println("Password -->" + "");
	
	System.out.print(generatePassword);
}
	
}
