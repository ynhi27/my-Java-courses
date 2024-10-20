/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex2;

public class CruiseShip extends Ship {
	
	private int maxPassengers;
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public CruiseShip(String name, String yearBuilt, int maxPassengers) {
		super(name, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
	
	public String toString() {
		return "Name: " + super.getName()
				+ "\nMaximum Passengers: " + maxPassengers
				+ "\n";
	}

}
