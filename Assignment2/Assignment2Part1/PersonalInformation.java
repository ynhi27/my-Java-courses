/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 2 - Part 1
Due Date: Mon Feb 6, 2023 11:59pm
Date Submitted: 02/04/2023
*/

package Part1;

public class PersonalInformation {
	/*This class include getters and setters of 4 variables below
	 * and print out the information*/
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalInformation() {
		this.name = "";
		this.address = "";
		this.age = 0;
		this.phoneNumber = "";
	}
	public PersonalInformation(String name, String address, int age, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public void print() {
		System.out.println("\nName: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Age: " + this.age);
		System.out.println("Phone Number: " + this.phoneNumber);
	}
}
