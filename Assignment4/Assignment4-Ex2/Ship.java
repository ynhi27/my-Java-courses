/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex2;

public class Ship {
	private String name, yearBuilt;
	
	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String toString() {
		return "Name: " + this.getName()
				+ "\nYear built: " + this.getYearBuilt()
				+ "\n";
	}
}
