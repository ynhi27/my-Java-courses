/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 2 - Part 2
Due Date: Mon Feb 6, 2023 11:59pm
Date Submitted: 02/04/2023
*/

package Part2;

public class Coin {
	
	//Declare instance variable
	private String sideUp;
	
	//No-arg constructor
	public Coin() {
		int flip = (int) (Math.random() * 2) + 1;
		if (flip == 1) {
			sideUp = "head";
		} else if (flip == 2) {
			sideUp = "tail";
		}
	}
	
	//Toss the coin 20 times and print the number of times Head or Tail
	public void toss() {
		int countTails = 0, countHeads = 0;
		
		System.out.print("The coin will flip 20 times.\n");
		
		for (int i = 0; i < 20; i++) {
			int flip = (int) (Math.random() * 2) + 1;
			if (flip == 1) {
				sideUp = "head";
				countHeads++;
			} else if (flip == 2) {
				sideUp = "tail";
				countTails++;
			}
			
			//Print the result after each toss
			System.out.println("#" + (i + 1) + " toss: " + sideUp);
		}
		
		//Print the total number of head or tail
		System.out.println("Heads appeared: " + countHeads);
		System.out.println("Tails appeared: " + countTails);
	}
	
	public String getSideUp() {
		return sideUp;
	}
}
