/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex2;

public class CargoShip extends Ship{
	
	private int cargoCapacity;	
	
	public CargoShip(String name, String yearBuilt, int cargoCap) {
		super(name, yearBuilt);
		this.cargoCapacity = cargoCap; 
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	public String toString() {
		return "Name: " + super.getName()
				+ "\nCargo Capacity: " + cargoCapacity
				+ "\n";
	}

}
