package com.payal_main;
import java.util.Scanner;

import com.payal_model.Employee;
import com.payalservice.CredentailService;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee = new Employee("Payal", "Dhokpande");
CredentailService cs = new CredentailService();
String generateEmail;
char [] generatePassword;

System.out.println("Please enter the departement from the following");
System.out.println("1. Techinical");
System.out.println("2. Admin");
System.out.println("3. HumanResource");
System.out.println("4. Legal");

Scanner sc =new Scanner (System.in);
int option = sc.nextInt();

String department = null;
switch(option){
case 1:
	generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			employee.getLastName().toLowerCase(), "techl");
	generatePassword = cs.generatePassword();
	cs.showCredential(employee, generateEmail, generatePassword);
	break;
	
case 2:
	generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			employee.getLastName().toLowerCase(), "admin");
	generatePassword = cs.generatePassword();
	cs.showCredential(employee, generateEmail, generatePassword);
	break;
case 3:
generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
		employee.getLastName().toLowerCase(), "hr");
generatePassword = cs.generatePassword();
cs.showCredential(employee, generateEmail, generatePassword);
break;

case 4:
generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
		employee.getLastName().toLowerCase(), "legal");
generatePassword = cs.generatePassword();
cs.showCredential(employee, generateEmail, generatePassword);
break;

default:
	System.out.println("Please provide the correct department");
	
	break;

}
		
		
	}

}
