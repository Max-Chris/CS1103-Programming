package com.in28minutes.oops.leve2.inheritance;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;
	
	public Person(){
		System.out.println("Person Constructor");
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return name + "#" + email + "#" + phoneNumber;
	}

}
