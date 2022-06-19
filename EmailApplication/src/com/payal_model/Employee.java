package com.payal_model;

public class Employee {
	
	//Employee employee = new Employee("Payal", "Dhokpande");
	//firstName, lastName
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	
	}
	public Employee(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName= lastName;
	}
}