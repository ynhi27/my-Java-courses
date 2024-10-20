/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex2;

public class Driver {

	public static void main(String[] args) {
		
		Ship[] ships = new Ship[6];
		
		ships[0] = new Ship("ABC Ship", "1909");
		ships[1] = new CruiseShip("Yolanda Ship", "1980", 500);
		ships[2] = new CargoShip("Container Ship", "2000", 300);
		ships[3] = new Ship("Alpha Ship", "1989");
		ships[4] = new CruiseShip("Tea Ship", "1982", 400);
		ships[5] = new CargoShip("Orange Ship", "2001", 380);
		
		for (Ship ship: ships) {
			System.out.println(ship.toString());
		}
	}
}
